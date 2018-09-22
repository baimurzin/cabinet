package org.itlabel.cabinet.service;

import org.itlabel.cabinet.model.UserModel;

import java.util.List;

public interface UserService {

    UserModel findUserById(Long id);

    List<UserModel> findAllUsers();

}
