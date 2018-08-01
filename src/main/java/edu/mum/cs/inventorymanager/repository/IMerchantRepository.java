package edu.mum.cs.inventorymanager.repository;

import edu.mum.cs.inventorymanager.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("merchantRepository")
public interface IMerchantRepository extends JpaRepository<Merchant, Long> {
	// Relies on the default public abstract methods defined in the super interface, JpaRepository<T, ID>
	// We may override or add more methods here, if needed
    Merchant findByMerchantId(long id);
}
