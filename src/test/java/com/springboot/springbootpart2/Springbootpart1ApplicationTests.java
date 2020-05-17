package com.springboot.springbootpart1;

import com.springboot.springbootpart1.controller.UserServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootpart1ApplicationTests {

	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	void contextLoads() {
	}
	@Test
	void addUser() {
		Assert.assertEquals("Simcar Mahlangu entered",userServiceImpl.addUser("Simcar", "Mahlangu"));
	}
	@Test
	void getUser() {
		Assert.assertEquals("Hello Nkosinathi Sithole",userServiceImpl.getUser(2));
	}
	@Test
	void removeUser() {
		Assert.assertEquals("Sindiswa Khama deleted",userServiceImpl.removeUser(3));
	}


}
