package com.ks.fibonacci;

public class Fib {
	public static void main(String[] args){
		int f1=0,f2=1,f3=0,count=30,i;
		System.out.println(f1);
		System.out.println(f2);
		for(i=0;i<count;i++){
			 f3=f1+f2; 
			 f1=f2;
			 f2=f3;
		System.out.println(f3);}

	}
}
