package org.ass.orderService.service.imp;

import java.util.Date;

import org.ass.orderService.dto.OrderDto;
import org.ass.orderService.entity.OrderEntity;
import org.ass.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderServiceImp implements OrderService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String placeOrder(OrderDto orderDto) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setProductId(orderDto.getProductId());
		orderEntity.setPaymentMode(orderDto.getPaymentMode());
		orderEntity.setQuantity(orderDto.getQuantity());
		orderEntity.setSoldDate(new Date());
		orderEntity.setTotalPrice(0.0);
	
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append("http://localhost:8080/SpringWeb/findProductPriceById/");
		urlBuilder.append(orderDto.getProductId());
		
		Double productPrice =restTemplate.getForObject(urlBuilder.toString(), Double.class);
		System.out.println("productPrice :" +productPrice);
		orderEntity.setTotalPrice((productPrice * orderDto.getQuantity()));
		
		return "Order Placed Successfully";
	}

}
