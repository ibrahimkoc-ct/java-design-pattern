package com.ba;

import com.ba.dpatterns.builder.Product;
import com.ba.dpatterns.builder.ProductLombok;
import com.ba.dpatterns.builder.Product.ProductBuilder;
import com.ba.dpatterns.decorator.Iphone;
import com.ba.dpatterns.decorator.Iphone11Pro;
import com.ba.dpatterns.decorator.Iphone11ProMax;
import com.ba.dpatterns.decorator.Phone;
import com.ba.dpatterns.factory.FileExporter;
import com.ba.dpatterns.factory.FileExporterFactory;
import com.ba.dpatterns.factory.FileExporterFactory.FileType;
import com.ba.dpatterns.singleton.BillPughSingleton;
import com.ba.dpatterns.singleton.EagerInitializationSingleton;
import com.ba.dpatterns.singleton.LazySingleton;
import com.ba.dpatterns.singleton.StaticBlockSingleton;
import com.ba.dpatterns.singleton.ThreadSafeSingleton;

public class Run {

	public static void main(String[] args) {
		/*EagerInitializationSingleton.getInstance().singletonTest();
		StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
		LazySingleton.getLazySingleton().singletonTest();
		ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();
		BillPughSingleton.getInstance().singletonTest();*/
	
		/*
		String file= FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("Test content");
		System.out.println(file);
		
	*/
		/*
		Product product = new Product();
		product.setId(1L);
		product.setDescription("Description");
		product.setName("Name");
		
		Product product2=new Product.ProductBuilder().id(12L).name("name").description("desc").build();
		ProductLombok instanceLombok=  ProductLombok.builder().id(1L).description("desc").build();
		System.out.println(instanceLombok);
		*/
		
		/*
		Phone phone= new Iphone11ProMax(new Iphone());
		System.out.println(" Price" +phone.getPrice());
		System.out.println(" Name" +phone.getName());
		System.out.println(" Camera Count" +phone.cameraCount());
			*/	
	}

}
