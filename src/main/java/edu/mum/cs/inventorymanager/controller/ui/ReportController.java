package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

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
