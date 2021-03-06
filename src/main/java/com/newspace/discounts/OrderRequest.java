package com.newspace.discounts;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "OrderId")
	private java.lang.Integer orderId;
	@org.kie.api.definition.type.Label(value = "PaymentType")
	private java.lang.String paymentType;
	@org.kie.api.definition.type.Label(value = "TotalPrice")
	private java.lang.Double totalPrice;
	@org.kie.api.definition.type.Label(value = "Discount")
	private java.lang.Integer discount;

	public OrderRequest() {
	}

	public java.lang.Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(java.lang.Integer orderId) {
		this.orderId = orderId;
	}

	public java.lang.String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(java.lang.String paymentType) {
		this.paymentType = paymentType;
	}

	public java.lang.Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(java.lang.Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public java.lang.Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(java.lang.Integer discount) {
		this.discount = discount;
	}

	public OrderRequest(java.lang.Integer orderId,
			java.lang.String paymentType, java.lang.Double totalPrice,
			java.lang.Integer discount) {
		this.orderId = orderId;
		this.paymentType = paymentType;
		this.totalPrice = totalPrice;
		this.discount = discount;
	}

}