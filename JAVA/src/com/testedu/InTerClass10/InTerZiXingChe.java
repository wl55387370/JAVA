package com.testedu.InTerClass10;

public class InTerZiXingChe implements InTerCar,Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("自行车跑的慢");
	}

	@Override
	public void wuRan() {
		// TODO Auto-generated method stub
		System.out.println("自行车污染小");
	}
	@Override
	public void guobiao() {
		// TODO Auto-generated method stub
		System.out.println("大于国标");
	}

}
