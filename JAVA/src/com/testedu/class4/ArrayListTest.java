 package com.testedu.class4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println("");
		//foreach遍历存储
		List<Integer> lista= new ArrayList<Integer>();
        for(int i:a) {
        lista.add(i);        	
        }	
        System.out.println("foreach遍历存储"+lista);
      //for遍历存储
		List<Integer> listaa= new ArrayList<>();
        for(int i=0;i<a.length;i++) {
        	 listaa.add(i); 	
        }	
        System.out.println("for遍历存储"+listaa);
        //aslist转换
        Integer[] a1 = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
  		List<Integer> lista1= Arrays.asList(a1);
          System.out.println("aslist转换"+lista1);
          
          
          System.out.println("=========================");
          //链表转数组
          //for循环存储
          int[] for1=new int[lista1.size()];
          for(int i=0;i<lista1.size();i++) {
        	  for1[i]=lista1.get(i);
          }
          for(int i:for1) {
        	  System.out.print(i+" ");
        	  }
          System.out.println(" ");
          
          //foreach循环存储
          int[] for2=new int[lista1.size()];
          int index=0;
          for(int i:lista1) {
        	  for2[index]=i;
        	  index++;
          }
          for(int i:for2) {
        	  System.out.print(i+" ");
        	  }
          System.out.println(" ");
          
          //toArray方法
          Integer[] arr=new Integer[lista1.size()];
          lista1.toArray(arr);
          for(int i:arr) {
        	  System.out.print(i+" ");
        	  }
          System.out.println(" ");
        
	}
	}
	


