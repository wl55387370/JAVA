package com.testedu.class3;

public class Math {

	public static void main(String[] args) {
		/***
		 * 求1-100中的质数输出不能被被任何大于1小于它本身的数整除的数
		 * */
		 for (int i = 1; i <= 100; i++) {
			   for (int j = 2; j <= i; j++) {
			  
			    if (i%j==0&&j!=i) {
			    	break;
			    }else if(j==i) {
			    	System.out.print(j+" ");
			    }
			
			   }				

	}}}


