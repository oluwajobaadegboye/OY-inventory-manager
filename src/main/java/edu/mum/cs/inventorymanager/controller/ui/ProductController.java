package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.model.entity.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"", "/", "/index"})
    public ModelAndView products() {
        ModelAndView mav = new ModelAndView();
        List<Product> products = productService.findAll();
        mav.addObject("products", products);
        mav.setViewName("products/index");
        return mav;
    }

    @GetMapping(value = "/new")
    public String createProduct(Model model, Principal principal) {
        model.addAttribute("product", new Product());
        return "products/new";
    }

    @PostMapping(value = "/new")
    public String createNewProduct(@Valid @ModelAttribute("product") Product product,
                                     BindingResult bindingResult, Model model, Principal principal, HttpSession session) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "product/new";
        }
        Merchant merchant = (Merchant) session.getAttribute("merchantInfo");
        product.setMerchant(merchant);
        productService.create(product);

        return "redirect:/products/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editProduct(@PathVariable Long id, Model model) {
        Product product = productService.findById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "products/edit";
        }
        return "products/index";
    }

    @PostMapping(value = "/edit")
    public String updateProduct(@Valid @ModelAttribute("product") Product product,
                                BindingResult bindingResult, Model model,HttpSession session) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "products/edit";
        }
        Merchant merchant = (Merchant) session.getAttribute("merchantInfo");
        product.setMerchant(merchant);
        productService.update(product);
        return "redirect:/products/index";
    }

    @PostMapping(value = "/delete")
    public String deleteProduct(@Valid @ModelAttribute("product") Product product,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "products/edit";
        }
        productService.delete(product);
        return "redirect:/products/index";
    }
}
