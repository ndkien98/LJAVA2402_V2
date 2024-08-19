package vn.com.t3h.service;

import vn.com.t3h.dto.UserDTO;

import java.util.List;

/**
 IUserService: Sử dụng để chuyên quản lý các hàm xử lý với thông tin
 user trong database được lấy lên từ UserRepository
 */
public interface IUserService {

    public List<UserDTO> getAllUser();
}
