package com.tka.ServiceInterface;

import com.tka.DTO.UserDto;
import com.tka.Entity.User;

public interface UserServiceInterface {
    User registerUser(UserDto userDto);
    String authenticate(UserDto userDto);
    User getUserById(Long id);
    void deleteUser(Long id);
}
