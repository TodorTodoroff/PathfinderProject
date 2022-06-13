package com.project.pathfinder.service;

import com.project.pathfinder.model.User;
import com.project.pathfinder.model.dto.UserRegisterDto;
import com.project.pathfinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserRegisterDto userRegisterDto) {
        if (!userRegisterDto.getConfirmPassword().equals(userRegisterDto.getPassword())) {
            throw new RuntimeException("passwords.match");
        }

        Optional<User> optUser = this.userRepository.findByEmail(userRegisterDto.getEmail());

        if (optUser.isPresent()) {
            throw new RuntimeException("email.used");
        }

        User user = new User(
                userRegisterDto.getAge(),
                userRegisterDto.getFullname(),
                userRegisterDto.getUsername(),
                userRegisterDto.getPassword(),
                userRegisterDto.getEmail()
        );

        this.userRepository.save(user);
    }


}
