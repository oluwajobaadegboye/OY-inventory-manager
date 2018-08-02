package edu.mum.cs.inventorymanager.dao;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MerchantDao {
    @Autowired
    IMerchantRepository merchantRepository;

    public Merchant createMerchant(Merchant merchant){
        return merchantRepository.save(merchant);
    }
    public Merchant findByMerchantId(Long id){
        return merchantRepository.findByMerchantId(id);
    }
    public Merchant findByEmail(String email){
        return merchantRepository.findByEmail(email);
    }
    public Merchant findByUsername(String userName){
        return merchantRepository.findByUsername(userName);
    }
    public List<Merchant> findByAll(){
        return merchantRepository.findAll();
    }
    public void delete(Merchant merchant){
        merchantRepository.delete(merchant);
    }
    public void delete(long merchantId){
        merchantRepository.deleteById(merchantId);
    }
    public Merchant update(Merchant merchant){
        return merchantRepository.save(merchant);
    }
}
