package com.testedu.class8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog doggy;
		doggy = new Dog();
//System.out.println(Dog.teeth);
		doggy = new Dog("小黑", 3);
		int a = Dog.grow(1);
		System.out.println("小黑长大到" + a + "岁");
		float b = Dog.grow(1.5f);
		System.out.println("小黑长大到" + b + "岁");
		double c =  Dog.grow(2.555);
		System.out.println("小黑长大到" + c + "岁");
	}
}
