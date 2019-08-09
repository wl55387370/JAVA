package com.testedu.class4;

public class Array {
	public static void main(String[] args) {

//		System.out.println("请输入数");
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//	for(int i=1;i<10;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(i+"x"+j+"="+i*j+" ");
//			//System.out.format("%10s",i+"x"+j+"="+i*j+" ");
//		}
//		System.out.println();
//	}	
		for (int i = 1; i < 10; i++) {
			int j = 1;
			while (j <= i) {
				System.out.print(i + "x" + j + "=" + i * j + " ");
				j++;
			}
			System.out.println();
		}
		for (int i = 1; i < 10; i++) {
			int j = 1;
			do {
				System.out.print(i + "x" + j + "=" + i * j + " ");
				j++;
			} while (j <= i);

			System.out.println();
		}

	}
}
