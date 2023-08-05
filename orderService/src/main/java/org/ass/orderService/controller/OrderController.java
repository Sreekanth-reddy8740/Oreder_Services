package org.ass.orderService.controller;

import org.ass.orderService.dto.OrderDto;
import org.ass.orderService.service.imp.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// it is a combination of ResponceBody and Controller, and it is used to create a object of controller class, and the converted java object in to JSON data.
public class OrderController {

	@Autowired
	private OrderServiceImp orderServiceimp;
	
	@RequestMapping(value = "/initiateOrder")
	public void initiateOrder(@RequestBody OrderDto orderDto) {
		orderServiceimp.placeOrder(orderDto);
	}
	
	public OrderController(){
		
		System.out.println(this.getClass().getSimpleName()+" class object created");
	}

}
