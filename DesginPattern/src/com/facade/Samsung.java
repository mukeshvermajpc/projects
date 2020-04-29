package com.facade;

public class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Samung on 5");
	}

	@Override
	public void price() {
		System.out.println("Price is: Rs. 12000");
	}

}
