package com.testedu.class6;

public class FibArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib= new int[20];
		fib[0]=1;
		fib[1]=1;
		for (int xiabiao=2;xiabiao<fib.length;xiabiao++) {
			fib[xiabiao]=fib[xiabiao-1]+fib[xiabiao-2];
		}
		for(int i:fib)
		System.out.print(i+" ");
	}

}
