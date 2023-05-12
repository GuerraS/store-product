package com.ed.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed.store.entity.Product;
import com.ed.store.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService; 
	
	@GetMapping("/getAll")
	public ResponseEntity<String> listAllProduct(){
		List<Product> products = productService.listAllProduct();
		if (products.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok("Hola");
	}
//	public ResponseEntity<Product> getProduct(Long id){
//		
//	}
//	public Product createProduct(Product product);
//	public Product updateProduct(Product product);
//	public Product deleteProduct(Long id);
//	public List<Product> findByCategory(Category category);
//	public Product updateStock(Long id, Double quantity);
}
