package com.testedu.class5;

public class StringOp {
	public static void main(String[] args) {
//		String ss="12345";
//		String s2="roy";
//		String s3=ss+s2;
//		System.out.println(s3);
		
		String listS="[1, 2, 3, 5, 4, 6, 9, 7, 8, 0]";
//		String s4=listS.substring(1, listS.length()-1);
//		System.out.println(s4);
//		String s5=s4.replace(", ", "");
//		System.out.println(s5);
//		System.out.println(s5.contains("1234"));
//		System.out.println(s5.contains("1235"));
		
//		String[] sss =listS.split("\\[|,\\s|\\]");
//		for(String tmp:sss) {
//			System.out.println(tmp);
//		}
		
		String rlistS=listS.replaceFirst("[4567]", "x");
		System.out.println(rlistS);
	}
}
