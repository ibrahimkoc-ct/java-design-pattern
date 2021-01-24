package com.ba.dpatterns.factory;

class ExcelExporter implements FileExporter{
	
	
	public String export(String content) {
		return "EXCEL -> "+ content;
	}

}
