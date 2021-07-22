package com.eduacandoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.projetoweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
