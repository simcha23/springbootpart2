package com.springboot.springbootpart2.dao;

import com.springboot.springbootpart2.service.FakeRepoInterface;
import com.springboot.springbootpart2.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class FakeRepo implements FakeRepoInterface {

    HashMap<Long, User> user = new HashMap<Long, User>();
    public long database(){

        user.put((long)1,new User(1, "Andiswa", "Mkhonto"));
        user.put((long)2,new User(1, "Nkosinathi", "Sithole"));
        user.put((long)3,new User(1, "Sindiswa", "Khama"));

        return user.size();
    }

    @Override
    public User insertUser(long id, String name, String surname) { //Adds user into a database

        user.put(id,new User(id,name,surname));
        return user.get(id);
    }

    @Override
    public User findUserById(long id) {//Finds a user by its Id

        return user.get(id);
    }

    @Override
    public User deleteUser(long id) { //Deletes a selected user

        return user.remove(id);
    }
}
