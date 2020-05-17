package com.springboot.springbootpart2.service;

import com.springboot.springbootpart2.model.User;

public interface FakeRepoInterface{

    User insertUser(long id, String name, String surname);

    User findUserById(long id);

    User deleteUser(long id);


}
