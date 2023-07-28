package com.soninisha.us.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.soninisha.us.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list = List.of(
			new User(1311L, "Nisha","9876543210"),
			new User(1312L, "Amit","78945612301"),
			new User(1313L, "Manish", "7418529630")
			
			);
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
