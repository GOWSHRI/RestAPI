package com.example.supermarket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.supermarket.model.User;


@Repository
public interface UserRepo extends JpaRepository<User,Long>{
   
}