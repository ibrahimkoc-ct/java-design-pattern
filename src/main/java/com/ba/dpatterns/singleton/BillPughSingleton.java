package com.ba.dpatterns.singleton;


public class BillPughSingleton {
	private BillPughSingleton() {
		
	}
	
	public static final BillPughSingleton getInstance(){
		
		return SingletonHelper.INSTANCE;
		
	}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE= new BillPughSingleton();
		
		
		
	}
	public void singletonTest() {
		System.out.println("Bill Pugh Singleton method calisti");
	}
	
	//Y�kleme s�resi thread safe den k�sad�r. Direk olarak static bir degi�ken tan�mlamad�g�m�z i�in jwm bunu hemen load etmeyecektir.
}
