package com.facade;

public class IPhone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("IPhone 6");

	}

	@Override
	public void price() {
		System.out.println("Price of phone is Rs. 70000");
	}

}
