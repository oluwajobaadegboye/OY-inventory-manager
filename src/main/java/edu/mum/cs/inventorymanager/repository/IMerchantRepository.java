package edu.mum.cs.inventorymanager.repository;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("merchantRepository")
public interface IMerchantRepository extends JpaRepository<Merchant, Long> {

    Merchant findByMerchantId(long id);

    Merchant findByEmail(String email);

    Merchant findByUsername(String userName);
}
