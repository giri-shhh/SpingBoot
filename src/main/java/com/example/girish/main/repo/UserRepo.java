package com.example.girish.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.girish.main.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
