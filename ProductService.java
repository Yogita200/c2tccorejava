package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.ProductEntity;

public interface ProductService {
	
	ProductEntity save(ProductEntity p);
	
	int deleteByPid(int pid);
	
	List<ProductEntity> findAll();
	
	ProductEntity findById(int pid);
	
		
}
