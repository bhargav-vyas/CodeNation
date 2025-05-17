package com.tka.ServiceInterface;

import com.tka.DTO.UserDto;
import com.tka.Entity.User;

public interface UserServiceInterface {
    User registerUser(UserDto userDto);
    String authenticate(UserDto userDto);
    User getUserById(Long id);
    User updateUser(Long id, UserDto userDto);
    void deleteUser(Long id);
}
