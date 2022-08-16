package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.User;

//DAO
//自動でBean登録
public interface UserRepository extends JpaRepository<User, Integer>{

}
