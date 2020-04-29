package com.facade;

public class Shopkeeper {
	private IPhone iphone;
	private Nokia nokia;
	private Samsung samsung;

	public Shopkeeper() {
		iphone = new IPhone();
		nokia = new Nokia();
		samsung = new Samsung();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void nokiaSale() {
		nokia.modelNo();
		nokia.price();
	}
}
