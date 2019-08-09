package com.testedu.class6;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		//外层循环，进行lun轮比较，一共需要比较n-1轮（第n轮只剩1个数，不用比了）
		for(int lun=1;lun<=a.length-1;lun++) {
			//内层循环，基于下标进行取值比较，遍历数组中的每个数，第一轮比n个数（下标从0到n-1），第二轮比n-1个数(下标从0到n-2)
			for(int xiabiao=0;xiabiao<a.length-lun;xiabiao++) {
				//比较，两个相邻的数之间进行比较，如果，前一个数比后一个数大，则交换
				if(a[xiabiao]>a[xiabiao+1]) {
					//进行交换
					//把左边的值赋给临时变量
					int tmp=a[xiabiao];
					//把右边的值赋给左边
					a[xiabiao]=a[xiabiao+1];
					//把临时变量的值赋给右边
					a[xiabiao+1]=tmp;
				}
			}
			
			System.out.println("第"+lun+"轮比较的结果：");
			for (int i:a) {
				System.out.print(i+" ,"+"");
			}
			System.out.println();
		}
		//输出排列好的结果
		for (int i:a) {
			System.out.print(i+" ,");
		}		
		
	}

}
