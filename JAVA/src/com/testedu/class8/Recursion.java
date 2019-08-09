package com.testedu.class8;

public class Recursion {
	public static int digui(int sum) {
		int result = 0;
		if (sum == 1 || sum == 2) {
			result = 1;
		} else {
			result = digui(sum - 1) + digui(sum - 2);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = digui(7);
		System.out.println(z);
	}

}
