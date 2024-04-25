package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Service.ProductService;
import com.example.demo.model.ProductEntity;

@Repository
public interface ProductDao  extends JpaRepository<ProductEntity, Integer> {
	
	ProductEntity save(ProductEntity p);
	
	int deleteByPid(int pid);
	
	List<ProductEntity> findAll();
	
	
	ProductEntity findById(int pid);

}
