package com.ba.dpatterns.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
		if(threadSafeSingleton==null) {
			threadSafeSingleton=new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}
	public void singletonTest() {
		System.out.println("ThreadSafe Singleton method calisti");
	}
	
	//Lazy singleton gibi �al�s�r fakat syncronized oldugu i�in i�lemleri s�raya kolay bu sayede multi thread �al��maya izin verir
	//Her seferinde bu check yaparken bir performans kayb� olur 
}
