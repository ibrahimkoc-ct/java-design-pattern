package com.ba.dpatterns.singleton;

public class EagerInitializationSingleton {
	
	private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {
		
	}
	
	public static EagerInitializationSingleton getInstance() {
		return INSTANCE;
	}
	public void singletonTest() {
		System.out.println("Eager Singleton method calisti");
	}
	
	//Bu durum bize bir tane instance yaratmay� garanti eder fakat ihtiyac�m�z olmad�g� durumlarda bile program �al��t�g� an bellekte yer kaplayacakt�r
	// ve exception handling yok
}
