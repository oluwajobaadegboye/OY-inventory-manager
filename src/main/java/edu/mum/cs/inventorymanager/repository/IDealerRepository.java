package edu.mum.cs.inventorymanager.repository;

import edu.mum.cs.inventorymanager.model.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "dealerRepository")
public interface IDealerRepository extends JpaRepository<Dealer, Long> {
}
