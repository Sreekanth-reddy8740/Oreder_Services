package org.ass.orderService.repository;

import org.ass.orderService.entity.OrderEntity;

public interface OrderRepository {
	
	public void saveOrder(OrderEntity orderEntity);

}
