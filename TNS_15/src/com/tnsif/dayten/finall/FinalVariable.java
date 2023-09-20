package com.tnsif.dayten.finall;

public class FinalVariable {
	
	 int speedlimit=90; // constant
	
	      void run() {
		speedlimit=125;
		System.out.println("Running safely with " + speedlimit +" kmph");
	}
	
	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.run();
		
	}

}
