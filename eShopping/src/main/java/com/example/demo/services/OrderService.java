package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orepo; 
	
	public List<Order> getOrders() {
		return orepo.findAll();
	}
	
	public List<Order> getShipperOrders() {
		return orepo.getShipperOrders();
	}
	public Order addOrder(Order o) {
		return orepo.save(o);
	}
	public List<Order> getOrderByCustId(int cust_id) {
		return orepo.getOrderByCustId(cust_id);
	}
}
