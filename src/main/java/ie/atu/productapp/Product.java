package ie.atu.productapp;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class Product {
    List<ProductController> productList = new ArrayList<>();

    @GetMapping

    public List<ProductController> getProductList() {
        return productList;
    }

    @PostMapping
    public List<ProductController> addProduct(@Valid @RequestBody ProductController product)
    {
        productList.add(product);
        return productList;
    }
}
