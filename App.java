package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Service.ProductService;
import com.example.demo.model.ProductEntity;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context=
		SpringApplication.run(App.class, args);
		
		ProductService ps=context.getBean(ProductService.class);
		
		ProductEntity pe =new ProductEntity();
		
		//....INSERT.... 
		
		/*pe.setPid(4);
		pe.setPname("jeens");
		pe.setPprice(990);
		pe.setPquality("best");
		
		System.out.println(ps.save(pe));*/
		
		/*....DELETE....
		
		System.out.println(ps.deleteByPid(1));*/
		
		/*DISPLAY-All product
		
		List<ProductEntity> list= ps.findAll();
		
		for(ProductEntity p:list)
		{
			System.out.println(p);
		}*/
		
		
		System.out.println(ps.findById(2));
		
	}

}
