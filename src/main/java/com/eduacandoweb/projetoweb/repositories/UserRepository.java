package com.eduacandoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.projetoweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
