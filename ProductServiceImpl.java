package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ProductDao;
import com.example.demo.model.ProductEntity;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao pd;

	@Override
	public ProductEntity save(ProductEntity p) {
		return pd.save(p);
	}

	@Override
	public int deleteByPid(int pid) {
		return pd.deleteByPid(pid);
	}

	@Override
	public List<ProductEntity> findAll() {
		return pd.findAll();
	}

	@Override
	public ProductEntity findById(int pid) {
		return pd.findById(pid);
	}
	

}
