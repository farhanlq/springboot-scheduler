package com.example.springbootscheduler.dao;

import com.example.springbootscheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserDao extends JpaRepository<User, Integer> {

}
