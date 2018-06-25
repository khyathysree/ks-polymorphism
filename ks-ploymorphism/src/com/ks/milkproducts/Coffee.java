package com.ks.milkproducts;

public class Coffee extends MilkProducts{
	
	protected String milkDetails(){
		super.milkDetails();
		return "2%fat";
	}
	protected void procedure(String color,String concentration,String quantity){
		System.out.println("procedures need to hav all these");
	}

	/*static{
		System.out.println("ststic method");
	}*/
	
	
	public static void main(String[] args) {
		MilkProducts milkProducts=new MilkProducts();
		System.out.println(milkProducts.milkDetails());
		Coffee cof=new Coffee();
		cof.procedure("red","high","full");
		System.out.println(cof.milkDetails());
		
	
}
}