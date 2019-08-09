package com.testedu.class8;

public class Dog {
	// 成员变量
	public String name = "豆豆";
	public String gender;
	// 类变量
	public static final String KIND = "犬科类";
	public String clore = "黑色";
	public static String teeth = "犬牙";
	public static int age = 0;

	// 成员方法
	public static int grow(int agel) {
		return age += agel;

	}

	public static float grow(float age2) {
		return age += age2;

	}

	public static double grow(double age3) {
		return age += age3;

	}

	public Dog() {

	}

	public Dog(String nname, int aage) {

		name = nname;
		age = aage;
		System.out.println("我叫" + name + "今年" + age + "岁");
	}

}
