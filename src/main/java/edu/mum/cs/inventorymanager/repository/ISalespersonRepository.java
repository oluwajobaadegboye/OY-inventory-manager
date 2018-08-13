package edu.mum.cs.inventorymanager.repository;

import edu.mum.cs.inventorymanager.model.entity.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalespersonRepository extends JpaRepository<Salesperson,Long> {
}
