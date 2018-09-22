package org.itlabel.cabinet.service.impl;

import org.itlabel.cabinet.model.UserModel;
import org.itlabel.cabinet.repository.UserRepository;
import org.itlabel.cabinet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }
}
