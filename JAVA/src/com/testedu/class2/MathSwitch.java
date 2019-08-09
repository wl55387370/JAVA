package com.testedu.class2;

import java.util.Scanner;

public class MathSwitch {

	public static void main(String[] args) {
		System.out.println("请输入月份：");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
	
		switch (x) {
		case "3":
		case "4":
		case "5":
			System.out.println("春季");
			break;
		case "6":
		case "7":
		case "8":
			System.out.println("夏季");
			break;
		case "9":
		case "10":
		case "11":
			System.out.println("秋季");
			break;
		default:
			System.out.println("冬季");
		
		}

	}

}
