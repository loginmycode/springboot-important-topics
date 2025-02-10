package com.unit.test.myapp;

import java.util.List;

public class ProductService {
	
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	public List<Product> getAllProduct()
	{
		return productRepository.findAll();
	}
}
