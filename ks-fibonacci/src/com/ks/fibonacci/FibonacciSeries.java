package com.ks.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i <= N; i++) {
            fS(i);
            
            System.out.println(fS(i));
          
        }
        scanner.close();
    }

    private static int fS(int n) {
        if (n==0) {
            return 0;
        } else if (n== 1) {
        	return 1;
        }
        else{
            return fS(n - 1) + fS(n - 2);
        }
    }
}