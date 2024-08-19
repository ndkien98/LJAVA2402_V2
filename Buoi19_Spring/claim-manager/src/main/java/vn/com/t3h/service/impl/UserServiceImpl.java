package vn.com.t3h.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.t3h.dto.UserDTO;
import vn.com.t3h.entity.UserEntity;
import vn.com.t3h.repository.UserRepository;
import vn.com.t3h.service.IUserService;
import java.util.ArrayList;
import java.util.List;

/**
 Được sử dụng để triển khai code xử lý các hàm được khai báo tại interface IUserService
 */
@Service// đánh dấu đây là tầng service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserDTO> getAllUser() {
        // query lấy danh sách user từ database sử dụng repository
        List<UserEntity> userEntities = userRepository.findAll();
        // chuyển dữ liệu từ dang entity sang dạng DTO để trả về controller
        List<UserDTO> userDTOs = new ArrayList<UserDTO>();
        for (UserEntity userEntity : userEntities) {
            UserDTO userDTO = new UserDTO();
            // Set các giá trị từ UserEntity sang UserDTO
            userDTO.setId(userEntity.getId());
            userDTO.setUsername(userEntity.getUsername());
            userDTO.setCode(userEntity.getCode());
            userDTO.setEmail(userEntity.getEmail());
            userDTO.setFirstName(userEntity.getFirstName());
            userDTO.setLastName(userEntity.getLastName());
            userDTO.setPhone(userEntity.getPhone());
            userDTO.setAddress(userEntity.getAddress());
            // Các trường từ BaseEntity sang UserDTO
            if (userEntity.getCreatedDate() != null){
                userDTO.setCreatedDate(userEntity.getCreatedDate().toLocalDate());
            }
            userDTO.setCreatedBy(userEntity.getCreatedBy());
            if (userEntity.getLastModifiedDate() != null){
                userDTO.setLastModifiedDate(userEntity.getLastModifiedDate().toLocalDate());
            }
            userDTO.setLastModifiedBy(userEntity.getLastModifiedBy());
            userDTO.setDeleted(userEntity.getDeleted());
            userDTOs.add(userDTO);
        }
        // trả về danh sách user cho controller
        return userDTOs;
    }
}
