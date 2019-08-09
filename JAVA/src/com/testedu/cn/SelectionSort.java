package com.testedu.cn;

public class SelectionSort {
	public static void main(String [] args) {
		int [] a= {5,4,6,70,56,90,411,528,100,99};
		for(int i=1;i<a.length;i++) {
			int index=i-1;
			int maxnumber=a[i-1];
			for(int j=i-1;j<a.length;j++){
				if(a[j]>maxnumber) {
					maxnumber=a[j];
					index=j;
				}
			}
			a[index]=a[i-1];
			a[i-1]=maxnumber;
		}
		for (int k : a) {
			System.out.print(k + " ");}
	}
}
