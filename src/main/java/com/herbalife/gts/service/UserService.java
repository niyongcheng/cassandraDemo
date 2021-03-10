package com.herbalife.gts.service;

import com.herbalife.gts.model.User;
import com.herbalife.gts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {
        return userRepository.getAll();
    }
}
