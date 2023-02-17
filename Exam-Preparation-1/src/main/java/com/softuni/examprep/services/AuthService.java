package com.softuni.examprep.services;

import com.softuni.examprep.domain.entities.User;
import com.softuni.examprep.domain.helpers.LoggedUser;
import com.softuni.examprep.domain.model.binding.UserLoginModel;
import com.softuni.examprep.domain.model.binding.UserRegisterModel;
import com.softuni.examprep.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final LoggedUser loggedUser;


    @Autowired
    public AuthService(UserRepository userRepository, ModelMapper modelMapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.loggedUser = loggedUser;
    }

    public void registerUser(UserRegisterModel userRegisterModel) {
        this.userRepository.saveAndFlush(this.modelMapper.map(userRegisterModel, User.class));
    }

    public void loginUser(UserLoginModel userLoginModel) {
        User byUsername = this.userRepository.findByUsername(userLoginModel.getUsername()).get();

        this.loggedUser.setId(byUsername.getId());
    }

    public void logoutUser() {
        loggedUser.clearUser();
    }
}
