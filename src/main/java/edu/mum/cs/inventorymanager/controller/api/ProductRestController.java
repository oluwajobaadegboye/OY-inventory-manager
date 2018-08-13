package edu.mum.cs.inventorymanager.controller.api;

import edu.mum.cs.inventorymanager.model.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = {"/api/products"})
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"", "/"})
    public List<Product> products() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findProductById(@Valid @PathVariable long id) {
        return productService.findById(id);
    }
}
