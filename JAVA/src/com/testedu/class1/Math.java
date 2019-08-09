package com.testedu.class1;

public class Math {

	public static void main(String[] args) {
		int a = (int) 'c';
		System.out.println(a);
		float b = 1.555f;
		double c = 3.255;
		byte d = -127;
		int x = (int) (a + b / c + d);
		System.out.println(b / c);
		float y = (float) ((a + b) % c + 5 - d);
		System.out.println((a + b) % c);
		double z = (float) (a + b % c * d);
		double z1 = (double) (a + b % c * d);
		System.out.println(b % c * d);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(z1);

	}

}
