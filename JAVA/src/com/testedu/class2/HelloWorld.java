package com.testedu.class2;

public class HelloWorld {
	public static void main(String[] args) {
		
//		System.out.println("请输入数");
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
		int x = 1;
		int y = 2;
		int z = x++ << 1 * ++y >> 1 / y++ << 1 + y >> x - 1 >> 1;

		System.out.println(z);
		if (x > 1 && !(x < 5) || x < -3) {

			System.out.println("x的取值范围;" + "(-∞,-3),[5,+∞)");
		} else {
		
			System.out.println("x的取值范围;" + "[-3,5)");
		}
		

	}
}
