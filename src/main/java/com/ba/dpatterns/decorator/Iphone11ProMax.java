package com.ba.dpatterns.decorator;


public class Iphone11ProMax extends Iphone11Pro {

	
	public Iphone11ProMax(Iphone basicPhone) {
		super(basicPhone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+ " Max ";
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+100;
	}
	
	public String extraMethod() {
		return "Kirmizi";
	}
}
