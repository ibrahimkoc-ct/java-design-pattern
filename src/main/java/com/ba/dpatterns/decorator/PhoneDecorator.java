package com.ba.dpatterns.decorator;

public class PhoneDecorator implements Phone {
	
	
	protected Phone basicPhone;
	
	public PhoneDecorator(Iphone basicPhone){
		this.basicPhone=this.basicPhone;
		
	}

	public String getName() {
		return basicPhone.getName();
	}

	public int cameraCount() {
		return basicPhone.cameraCount();
	}

	public double getPrice() {
		return basicPhone.getPrice();
	}

}
