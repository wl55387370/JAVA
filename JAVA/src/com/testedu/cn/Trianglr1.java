package com.testedu.cn;

public class Trianglr1 {

	public static void main(String[] args) {
		int h = 11;
		int[] arr1 = new int[h];
		int[] arr2 = new int[h];
		arr1[0] = 1;

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					arr2[j] = 1;
				}
				else {
					arr2[j] = arr1[j] + arr1[j - 1];
				}
			}
			for (int k = 0; k < i; k++) {
				arr1[k] = arr2[k];
			}
			if (i < h) {
				String formatln = "%" + (h - i) *2 + "s";
				System.out.format(formatln, "");
			}
			for (int x = 0; x < i; x++) {
			System.out.format("%4d", arr2[x]);
		}
		System.out.println("");
		}

	}

}