package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/report" )
    public String report(Model model) {
        model.addAttribute("product", new Product());
        return "users/saler/report";
    }

    @GetMapping(value = "/report/byprofit" )
    public String reportbyprofit(Model model) {
        model.addAttribute("product", new Product());
        return "report/byprofit";
    }


    @GetMapping(value = "/report/bysalesman" )
    public String reportBysalesman(Model model) {
        model.addAttribute("product", new Product());
        return "report/bysalesman";
    }






}
