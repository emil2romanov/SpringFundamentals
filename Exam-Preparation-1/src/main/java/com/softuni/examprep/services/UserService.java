package com.softuni.examprep.services;

import com.softuni.examprep.domain.entities.User;
import com.softuni.examprep.domain.helpers.LoggedUser;
import com.softuni.examprep.domain.model.UserModel;
import com.softuni.examprep.domain.model.UserWithShipsModel;
import com.softuni.examprep.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final LoggedUser loggedUser;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.loggedUser = loggedUser;
    }

    public UserModel findByUsername(String username) {
        return this.modelMapper.map(this.userRepository.findByUsername(username).orElse(new User()), UserModel.class);
    }

    public UserModel findById(Long id) {
        return this.modelMapper.map(this.userRepository.findById(id).orElse(new User()), UserModel.class);
    }

    public UserModel findByIdNot(Long id) {
        return this.modelMapper.map(this.userRepository.findByIdNot(id).orElse(new User()), UserModel.class);
    }
}
