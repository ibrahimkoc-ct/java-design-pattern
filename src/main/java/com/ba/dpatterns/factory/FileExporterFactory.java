package com.ba.dpatterns.factory;

public class FileExporterFactory {
	public static FileExporter getInstance(FileType fileType) {
		switch(fileType) {
		case EXCEL: return new ExcelExporter();
		case PDF: return new PdfExporter();
		default: throw new UnsupportedOperationException();
		
		}
	}
	
	public enum FileType{
		PDF,
		EXCEL;
	}
	
	//Bu pattern ayn� tipteki nesnelerin �retmeyi tek bir noktadan yaparak kod tekrar�n� engeller
	// Ve daha saonra kullanacak olan developerlar i�in arkas�ndaki k�s�mlar� bilmeden gerekli parametreleri vererek do�rudan o classlara eri�meden kullanabilirler
}
