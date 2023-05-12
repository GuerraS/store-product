package com.ed.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ed.store.entity.Category;
import com.ed.store.entity.Product;
import com.ed.store.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateStock(Long id, Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}
