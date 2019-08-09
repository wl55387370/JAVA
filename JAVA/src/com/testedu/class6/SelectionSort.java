package com.testedu.class6;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		/*
		 * 找最小值放到第一位，实现升序排列
		 */
		// 循环查找lun轮，每次找到最小值，第一次比较15个数，第二次比较，比较14个数，依次递减，直到比较完成。一共需要比较n-1轮（第n轮只剩1个数，不用比了）
		for (int lun = 1; lun < a.length; lun++) {
			// 记录最小值的对应下标
			int index = lun - 1;
			// 记录最小值
			int minnumber = a[lun - 1];
			// 循环比较从0到最后一个数字，找出最大值，记录在maxnumber和index里面，和最后一个位置的数字进行交换。
			for (int xiabiao = lun - 1; xiabiao < a.length; xiabiao++) {
				// 当前下标位置的值，和最小值进行比较
				if (a[xiabiao] < minnumber) {
					// 当前位置的值，小于最小值，那么将最小值改为当前位置的值
					minnumber = a[xiabiao];
					// 将最小值的对应下标，改为当前位置的下标。
					index = xiabiao;
				}
			}
			// 和当前未完成排序的数字里的最后一个进行位置的交换
			// 将队首的值，赋给最小值所在的下标
			a[index] = a[lun - 1];
			// 队首的值，变为最小值
			a[lun - 1] = minnumber;
			// 输出当次循环之后的排序结果数组内容
			for (int x : a) {
				System.out.print(x + ",");
			}
			System.out.println();
		}
		// 输出最终结果
		for (int x : a) {
			System.out.print(x + ",");
		}

	}
}
