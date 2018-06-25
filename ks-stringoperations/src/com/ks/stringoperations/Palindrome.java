package com.ks.stringoperations;

public class Palindrome extends StringReversal {
	
	public boolean palindromeCheck(String input){
		String reversedValue = reversal(input);
		if(input.equals(reversedValue)){
				return true;
				}else{
					return false;
				}
		
		
	
	}
	public static void main(String[] args){
		Palindrome palindrome=new Palindrome();
		System.out.println(palindrome.palindromeCheck("aaa"));
		System.out.println(palindrome.palindromeCheck("abc"));
	}

}
