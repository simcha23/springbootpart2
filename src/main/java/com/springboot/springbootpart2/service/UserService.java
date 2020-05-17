package com.springboot.springbootpart2.service;

public interface UserService {

    String addUser(String name, String surname);

    String removeUser(long Id);

    String getUser(long Id);

}
