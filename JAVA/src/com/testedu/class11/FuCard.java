package com.testedu.class11;

public class FuCard {
	public int count=0;
	public boolean share() {
		if(count>0) {
			count--;
			System.out.println("分享福卡成功");
			return true;
		}
		else {
			System.out.println("没有福卡可分享");
			return false;
		}
	}
	
	public void getCard(int num) {
		count+=num;
		System.out.println("获取"+num+"张福卡");
	}
	
	public int showCard() {
		System.out.println("您有"+count+"张福卡");
		return count;
	}
}
