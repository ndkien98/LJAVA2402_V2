package vn.com.t3h.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configurable
@EnableWebSecurity
public class SecurityConfig {

    // Tạo ra hàm mã hóa, giải mã password được dùng để mã hoa password trong database và Fe
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    // config chính của spring seucirty
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/cms/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                        .requestMatchers("/", "/home-page", "/login",
                                "/assets/**", "/fonts/**", "/homeguest_files/**",
                                "/js/**", "/libs/**", "/loginmetlife/**",
                                "/page404/**", "/scss/**", "/tasks/**", "/css/**", "/images/**","/cms-rs/**").permitAll()
                        .requestMatchers("/resource/**").permitAll()
                        .requestMatchers("/api/**").permitAll() // Permit all cho tất cả các endpoint bắt đầu bằng /api
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/perform_login")
                        .defaultSuccessUrl("/cms/dashboard", true) // sau khi login thành công sẽ truy cập vào url process-after-login để điều hướng phân quyền
                        .failureUrl("/login?error=true")
                        .permitAll()
                )
                .logout((logout) -> logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .permitAll()
                );

        return http.build();
    }

    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("Password account admin: " + encoder.encode("admin"));
        System.out.println("Password account user: " + encoder.encode("user"));
    }
}
