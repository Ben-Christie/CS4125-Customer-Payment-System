package com.shopmanagementsystem.spring;

import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.Product;
import com.shopmanagementsystem.spring.Database.DBEntity.User;
import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ProductDAO productDAO;

	//@Test
	void addUser() {
		User user = new User();
		user.setName("jeff@gmail.com");
		user.setPassword("max123");
		userDAO.save(user);
	}

	//@Test
	void getAllEmployees(){
		List<User> users = userDAO.getAllUsers();
		System.out.println(users);
	}

	@Test
	void getAllProducts(){
		List<Product> products = productDAO.getAllProducts();
		System.out.println(products);
	}



}
