package com.ba.dpatterns.decorator;

public class Iphone11 extends PhoneDecorator {

	public Iphone11(Iphone basicPhone) {
		super(basicPhone);
		}
		@Override
		public String getName() {
			return super.getName()+"11";
		}
		@Override
		public double getPrice() {
			// TODO Auto-generated method stub
			return super.getPrice()+100;
		}
		@Override
		public int cameraCount() {
			// TODO Auto-generated method stub
			return super.cameraCount()+1;
		}
}
