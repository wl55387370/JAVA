package com.testedu.class7;

public class Person {
	public String name;
	public int age;
	public boolean sex;
	public final String HUMAN="人类";
	public static String race="黄种人";
	
	public  void Person1(String name1,int age1) {
		name=name1;
		age=age1;
		System.out.println("我叫"+name+","+age+"岁");
		
	}
	public static void eat(){
		System.out.println(race+"吃米饭");
	}
	public  void love(){
		System.out.println("谈恋爱");
	}
	
}
