package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaleProductController {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/merchant/saleproduct" )
    public String saleProductM(Model model) {
        model.addAttribute("product", new Product());
        return "users/merchant/sale";
    }


    @GetMapping(value = "/saleproduct" )
    public String saleProductS(Model model) {
        model.addAttribute("product", new Product());
        return "users/saler/sale";
    }



}
