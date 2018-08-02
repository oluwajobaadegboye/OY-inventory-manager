package edu.mum.cs.inventorymanager.service.contract;

import edu.mum.cs.inventorymanager.model.entity.Merchant;

import java.util.List;

public interface MerchantService {

    public Merchant createMerchant(Merchant merchant);
    public Merchant findByMerchantId(Long id);
    public Merchant findByEmail(String email);
    public Merchant findByUsername(String userName);
    public List<Merchant> findByAll();
    public void delete(Merchant merchant);
    public void deleteById(long merchantId);
    public void update(Merchant merchant);

}
