package com.ks.milkproducts;

public  class MilkProducts { 


		public final String manfacturerDetails(){
		return "KS - Manufacturer";
	}
		
	
	
	protected void procedure(String name){
		System.out.println("only one");
	}

	/*public  MilkProducts(){
		
	}*/
	
	protected String milkDetails(){
		System.out.println("gives 100%");
		return "100%fat";
	}

}
