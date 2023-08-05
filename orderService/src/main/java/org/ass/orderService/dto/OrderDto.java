package org.ass.orderService.dto;

import java.io.Serializable;

public class OrderDto implements Serializable{

	private long ProductId;
	
	private Integer quantity;
	
	private String paymentMode;

	public long getProductId() {
		return ProductId;
	}

	public void setProductId(long productId) {
		ProductId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	
}
