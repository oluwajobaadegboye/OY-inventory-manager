package edu.mum.cs.inventorymanager.repository;

import edu.mum.cs.inventorymanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "productRepository")
public interface IProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByStatus(String status);
}
