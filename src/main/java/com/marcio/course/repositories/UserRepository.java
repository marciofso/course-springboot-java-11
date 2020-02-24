package com.marcio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
