package com.spring.service.impl;

import com.spring.dto.AddressDto;
import com.spring.dto.UserDto;
import com.spring.modal.Address;
import com.spring.modal.User;
import com.spring.repository.UserRepo;
import com.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto addUser(UserDto userDto) {
        List<AddressDto> addresses = userDto.getAddresses();
        for (AddressDto a : addresses){
           a.setUser(userDto);
        }
        User user = modelMapper.map(userDto, User.class);
        User save = userRepo.save(user);
        return  modelMapper.map(save, UserDto.class);
    }

    @Override
    public UserDto getById(String id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return List.of();
    }
}
