package com.ba.dpatterns.singleton;

public class LazySingleton {
	private static LazySingleton lazySingleton;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getLazySingleton() {
		if(lazySingleton==null) {
			lazySingleton= new LazySingleton();
		
		}
		return lazySingleton;
	}
	
	public void singletonTest() {
		System.out.println("Lazy Singleton method calisti");
	}
	
	//Bu �ekilde yapt�g�m�z zaman ba�lang��ta bir instance yaratmaz ve bellekte yer kaplamaz. Fakat her �a��r�ld�g�nda null check yapmak zorunda kal�r. 
	//Birden fazla thread eri�meye �al���rsa lag olu�turabilir veya runtime exception olu�turabilir. 
	//Multi thread i�lem yapm�yorsak en kolay ve en iyi y�ntem olabilir.
	
}
