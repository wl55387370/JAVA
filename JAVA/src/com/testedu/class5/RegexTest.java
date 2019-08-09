package com.testedu.class5;



public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String roy="rrr老师";
//		String will="woowoowoo老师";
//		String tufei="土匪老师";
//		String kaka="卡卡老师";
//		String regex="(roy){3}老师";
//		System.out.println(roy.matches(regex));
//		System.out.println(will.matches(regex));
		
//		String mobile="13112345678";
//		String mobile1="1311111111111";
//		String mobile3="1234";
//		String mobile2="12345678901";
//		String moRegex="1[3579]\\d{9}";
//		System.out.println(mobile.matches(moRegex));
//		System.out.println(mobile1.matches(moRegex));
//		System.out.println(mobile3.matches(moRegex));
//		System.out.println(mobile2.matches(moRegex));
		//qq号码 5-10位任何数字
		String qq1="123456769";
		String roy="5782258400";
		String qq3="12345678901";
		String qqRegex="\\d{5,10}";
		System.out.println(qq1.matches(qqRegex));
		System.out.println(roy.matches(qqRegex));
		System.out.println(qq3.matches(qqRegex));
	}

}
