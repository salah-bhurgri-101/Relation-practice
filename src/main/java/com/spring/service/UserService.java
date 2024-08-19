package com.spring.service;

import com.spring.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto addUser (UserDto userDto);

    UserDto getById (String id);

    List<UserDto> getAllUser();

}
