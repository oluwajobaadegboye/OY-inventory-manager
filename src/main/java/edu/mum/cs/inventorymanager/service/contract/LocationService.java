package edu.mum.cs.inventorymanager.service.contract;

import edu.mum.cs.inventorymanager.model.entity.Location;
import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.model.entity.User;


public interface LocationService extends AbstractService<Location>{
    public Location findByLocationName(String locationName);
    public Location findMerchant(Merchant merchant);
}
