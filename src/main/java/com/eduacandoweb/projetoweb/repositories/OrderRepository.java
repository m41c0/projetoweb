package com.eduacandoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.projetoweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
