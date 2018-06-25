package com.ks.stringoperations;

public class StringReversal {
	public  String  reversal(String input){
		String[] stringArray = input.split("");
		/*int i=0;
		while(i<stringArray.length){
		System.out.println(stringArray[i]);
		i++;
		}*/
		String s = "";
  		for(int j = stringArray.length-1;j>=0;j--){
		s = s.concat(stringArray[j]);
		}
		return s;
		}
}