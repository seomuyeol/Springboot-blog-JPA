package com.cos.blog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void userSave(User user) {
		userRepository.save(user);
	}

	@Transactional(readOnly = true) //Select 할때 트랜잭션 시작, 서비스 종료시에 ㅌ랜잭션 정합성
	public User userLogin(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
	}
}
