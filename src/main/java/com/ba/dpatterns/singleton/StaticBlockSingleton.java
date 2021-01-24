package com.ba.dpatterns.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton staticBlockSingleton;
	
	static {
		 try {
			 staticBlockSingleton= new StaticBlockSingleton();
		} catch (Exception e) {
			
		}
	}
	
	private StaticBlockSingleton() {
		
	}
	public static StaticBlockSingleton getStaticBlockSingleton() {
		return staticBlockSingleton;
	}
	
	public void singletonTest() {
		System.out.println("Static Block Singleton method calisti");
	}
	// try-catch ile kullanabiliyoruz Eager benziyor
	// Her halukarda bir instance olu�turulmas� gerekiyorsa bunu kullanmak iyi bir y�ntemdir
}
