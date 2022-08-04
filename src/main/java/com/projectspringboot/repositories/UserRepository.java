package com.projectspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

