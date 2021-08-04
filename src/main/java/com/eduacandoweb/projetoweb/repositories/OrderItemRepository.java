package com.eduacandoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.projetoweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
