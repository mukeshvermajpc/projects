package com.facade;

public class Nokia implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Nokia 800");
		
	}

	@Override
	public void price() {
		System.out.println("Price is:23000");
	}

}
