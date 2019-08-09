package com.testedu.class9;

import com.testedu.class10.Animal;

public class Human extends Animal{


	public  int height=170;
	public String gender;
	public int age=0;
	
	public Human(int ht,int wt) {
		super.height=ht;
		super.weight=wt;
	}
	
	public void makeTools() {
		System.out.println("人类可以制造工具。");
	}
	//重写
	public void eat() {
		System.out.println("人类吃饭");
	}
	//重载
	public void eat(String food) {
		System.out.println("人类吃"+food);
	}
	public void play(String bt) {
		System.out.println("人类在玩："+bt);
	}
	

	protected void readBook() {
		System.out.println("人类在看书");
	}
	
	}

