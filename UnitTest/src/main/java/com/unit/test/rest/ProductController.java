package com.unit.test.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.test.myapp.Product;
import com.unit.test.myapp.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	public final ProductService productService;

	public ProductController(ProductService productService) {
		
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public List<Product> getAllProduct()
	{
		return productService.getAllProduct();
	}

}
