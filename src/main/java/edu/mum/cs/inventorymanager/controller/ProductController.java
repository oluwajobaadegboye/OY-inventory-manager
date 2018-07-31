package edu.mum.cs.inventorymanager.controller;


import edu.mum.cs.inventorymanager.dao.ProductDAO;
import edu.mum.cs.inventorymanager.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController("/products")
public class ProductController {
    ProductDAO productDAO = new ProductDAO();

    @GetMapping
    public List<Product> getAllProduct(){
        List<Product> products = productDAO.getAllProducts();
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        int id = productDAO.genId();
//        Product product = new Product();
        product.setId(id);
        productDAO.addProduct(product);
        return product;
    }
}
