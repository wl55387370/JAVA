package com.testedu.class6;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义杨辉三角的层数,层数=当前层的数组长度
		int yh = 11;
		// 最大的数组长度应该是最下层（11层）共11个数。
		// arr1表示上层数组，arr2表示当前层数组。
		int[] arr1 = new int[yh];
		int[] arr2 = new int[yh];
		// 第一层的初始化。
		arr1[0] = 1;
		// 基于每一层进行循环计算
		for (int ceng = 1; ceng <= yh; ceng++) {
			/**
			 * 计算当前层的arr2数组的值。
			 */
			// 当前层的数组长度，等于层数，基于每层的规律，判断如果是第一位和最后一位，则赋值为1，如果不是，那么根据上层数组来进行计算。
			for (int xiabiao = 0; xiabiao < ceng; xiabiao++) {
				// 当前ceng层的最后一位和第一位都等于1
				if (xiabiao == 0 || xiabiao == ceng - 1) {
					arr2[xiabiao] = 1;
				}
				// 如果不是第0位和第1位
				else {
					arr2[xiabiao] = arr1[xiabiao] + arr1[xiabiao - 1];
				}
			}

			/**
			 * 将arr2的值复制到arr1，以准备开始下次循环的计算。
			 */
			// 将arr2复制到arr1
			for (int k = 0; k < ceng; k++) {
				arr1[k] = arr2[k];
			}
			/**
			 * 在每一层之前输出对应长度的空格，让排版变成金字塔形。
			 */
			if (ceng < yh) {
				//第ceng层就在前面空(n-ceng)/2个空格
				String formatln = "%" + (yh - ceng) *2 + "s";
				System.out.format(formatln, "");
			}
			/**
			 * 输出每一层的数组中的内容。
			 */
			for (int x = 0; x < ceng; x++) {
			System.out.format("%-4d", arr2[x]);
		}
		System.out.println("");
		}

	}

}
