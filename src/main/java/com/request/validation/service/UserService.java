package com.request.validation.service;

import com.request.validation.dto.UserRequest;
import com.request.validation.entity.User;
import com.request.validation.exception.UserNotFoundException;
import com.request.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(userRequest.getUserId(), userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        User user = userRepository.findByUserId(id);
        if (user != null)
            return user;
        else throw new UserNotFoundException("User not found with id: "+id);
    }
}
