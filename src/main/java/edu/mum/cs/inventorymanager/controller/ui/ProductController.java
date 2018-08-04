package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping(value={"/products/", "/products/index"})
    public ModelAndView merchants() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("merchants", new Product());
        mav.setViewName("products/index");
        return mav;
    }

    @GetMapping(value = "products/new")
    public String createProduct(Model model){
        model.addAttribute("product", new Product());
        return "products/new";
    }

    @PostMapping(value = "/products/new")
    public String registerNewProduct(@Valid @ModelAttribute("product") Product product,
                                         BindingResult bindingResult, Model model, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "product/new";
        }
        return "redirect:/login";
    }
}
