package com.testedu.class6;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = args[0];
		String bb = args[1];
		try {
			float a = Float.parseFloat(aa);
			float b = Float.parseFloat(bb);
			if (a == b) {
				System.out.println("参数相等");
			} else if(a>b){
				System.out.println("第1个数更大");
			}
			else{
				System.out.println("第2个数更大");	
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("輸入參數非法");
		}
		
		String regex="\\w+@\\[0-9a-zA-Z] {2,10}\\.com";
		String ss1="12345@qqzcom";
		String ss="12345@qq.com";
		System.out.println(ss1.matches(regex));
	}

}
