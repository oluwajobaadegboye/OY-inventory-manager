package edu.mum.cs.inventorymanager.service;

import edu.mum.cs.inventorymanager.dao.MerchantDao;
import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.service.contract.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    private final MerchantDao merchantDao;
    @Autowired
    public MerchantServiceImpl(MerchantDao merchantDao){
        this.merchantDao = merchantDao;
    }

    @Override
    public Merchant createMerchant(Merchant merchant) {
        return null;
    }

    @Override
    public Merchant findByMerchantId(Long id) {
        return null;
    }

    @Override
    public Merchant findByEmail(String email) {
        return null;
    }

    @Override
    public Merchant findByUsername(String userName) {
        return null;
    }

    @Override
    public List<Merchant> findByAll() {
        return null;
    }

    @Override
    public void delete(Merchant merchant) {

    }

    @Override
    public void deleteById(long merchantId) {

    }

    @Override
    public void update(Merchant merchant) {

    }
}
