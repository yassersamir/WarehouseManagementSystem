package com.yasser.WarehouseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yasser.WarehouseManagementSystem.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
