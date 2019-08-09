package com.testedu.class10;

public class Dog extends Animal {
	public Dog(int ht,int wt) {
		super.height=ht;
		super.weight=wt;
	}
	
	
	//重写
	public void eat() {
		System.out.println("狗啃骨头");
	}
	//重载
	public void eat(String food) {
		System.out.println("狗吃"+food);
	}
	public void play(String bt) {
		System.out.println("狗在玩："+bt);
	}
}
