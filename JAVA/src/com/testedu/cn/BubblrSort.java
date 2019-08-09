package com.testedu.cn;



public class BubblrSort {
public static void main(String [] args) {
	
	int [] a= {5,4,6,70,56,90,411,528,100,99};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]<a[j+1]) {
				int tep=a[j+1];
				a[j+1]=a[j];
				a[j]=tep;
			}
		}
	}
	for(int k:a) {
		System.out.print(k+" ");
	}
}

}
