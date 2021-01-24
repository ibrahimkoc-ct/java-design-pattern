package com.ba.dpatterns.factory;

class PdfExporter implements FileExporter{
	public String export(String content) {
		return "PDF -> "+ content;
	}
}
