package com.ba.dpatterns.decorator;

public class NormalSample {

	public static class Iphone11 {
		public String name() {
			return "Iphoone 11";
		}

		public int getCameraCount() {
			return 2;
		}
	}
	
	public static class Iphone11Pro {
		public String name() {
			return "Iphoone 11Pro";
		}

		public int getCameraCount() {
			return 3;
		}
	}
	
	public static class Iphone11ProMax {
		public String name() {
			return "Iphoone 11 Pro Max";
		}

		public int getCameraCount() {
			return 3;
		}
	}
	
	
}
