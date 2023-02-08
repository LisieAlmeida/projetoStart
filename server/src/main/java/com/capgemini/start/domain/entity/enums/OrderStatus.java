package com.capgemini.start.domain.entity.enums;

public enum OrderStatus {

		PENDING_PAYMENT(1),
		PROCESSING(2),
		SHIPPED(3),
		DELIVERED(4),;
	
		private int code;

		OrderStatus(int code) {
			this.code = code;		
		}
		
		public int getCode() {
			return code;
		}
		
		public static OrderStatus valueOf(int code) {
			for (OrderStatus value : OrderStatus.values()) {
				if(value.getCode() == code) {
					return value;
				}
			}
			throw new IllegalArgumentException("Código de status inválido");
		}
}
