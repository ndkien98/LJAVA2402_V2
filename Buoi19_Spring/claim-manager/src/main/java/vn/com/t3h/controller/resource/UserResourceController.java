package vn.com.t3h.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.t3h.dto.UserDTO;
import vn.com.t3h.service.IUserService;

import java.util.List;

@RestController// khai báo đây là một restcontroller chuyên nhận request và trả về response
@RequestMapping("api/user/") // chỉ định url cho api bắt đầu bằng http://localhost:8080/api/user/
public class UserResourceController {

    @Autowired // Tiêm bean từ ngoài vào sử dụng design DI
    private IUserService iUserService; // khai báo tầng service

    // Sử dụng phương thức GET
    @GetMapping("all-user")// định nghĩa url sẽ được mapping. ứng với url http://localhost:8080/api/user/all-user
    // sẽ được hàm getAllUser tiếp nhận và xử lý
    public ResponseEntity<List<UserDTO>> getAllUser() {
        // gọi tới tầng service để nhận về dữ liệu DTO
        List<UserDTO> userDTOList = iUserService.getAllUser();
        // trả dữ liệu từ service về response để chuyển sang dữ liệu dưới dạng json
        return ResponseEntity.ok(userDTOList);
    }
    // PathVariable truyền tham số trên url
    // viết api lấy ra thông tin user dự vào id
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO userDTO = iUserService.findById(id);
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO){
        UserDTO responseUser = iUserService.updateUser(userDTO);
        return ResponseEntity.ok(responseUser);
    }
}
