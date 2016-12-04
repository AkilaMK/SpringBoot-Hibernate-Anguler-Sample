package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Product;

public interface ProductDAO {
	public void saveProduct(Product product);

	public List<Product> getAllProducts();

	public List<Product> searchProductIgnoreCase(String name);
}
