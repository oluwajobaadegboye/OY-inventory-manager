package edu.mum.cs.inventorymanager.controller;


import edu.mum.cs.inventorymanager.model.Merchant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/merchant")
public class MerchantController {

    @GetMapping
    public Merchant findAll(){
        return new Merchant();
    }
}
