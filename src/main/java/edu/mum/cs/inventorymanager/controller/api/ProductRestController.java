package edu.mum.cs.inventorymanager.controller.api;

import edu.mum.cs.inventorymanager.model.dto.ProductDTO;
import edu.mum.cs.inventorymanager.model.entity.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = {"/api/products"})
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"", "/"})
    public List<ProductDTO> products() {
        List<Product> products = productService.findAll();
        return products.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProductDTO findProductById(@Valid @PathVariable long id) {
        Product product = productService.findById(id);
        return new ProductDTO(product);
    }

    @PutMapping("/{id}")
    public ProductDTO updateProductById(@Valid @PathVariable long id, @RequestBody ProductDTO productDTO) {
        Product product = productService.findById(id);
        product.update(productDTO);
        productService.update(product);
        return new ProductDTO(product);
    }
}
