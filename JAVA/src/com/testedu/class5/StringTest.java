package com.testedu.class5;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a=1234;
//		a.toString();
//		String s=a+"";
//		System.out.println(s);
//		String s1=String.valueOf(a);
//		System.out.println(s.equals(s1));
		
		String is="12356a";
		int ii=1;
		try {
			ii = Integer.parseInt(is);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("输入参数错误");
		}
		System.out.println(ii);
	}

}
