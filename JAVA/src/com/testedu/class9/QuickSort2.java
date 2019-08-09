package com.testedu.class9;

public class QuickSort2 {
		
		public static int[] quickSort(int[] a,int low,int high) {
			int left=low;
			int right=high;
			int base=a[high];
			while(left<right)
			{
				while(left<right) {
					 if(a[left]<base) {
						left++;
					}
					else {
						int tmp=a[left];
						a[left]=a[right];
						a[right]=tmp;
						right--;
						break;
					}
				}
				while(left<right) {
					if(a[right]>base) {
						right--;
					}
					else {
						int tmp=a[left];
						a[left]=a[right];
						a[right]=tmp;
						left++;
						break;
					}
				}	
			}
			
			if(low<right-1) {
				quickSort(a, low, right-1);
			}
			
			if (high > left + 1) {
				quickSort(a, left + 1, high);
			}
			
			return a;
		}

		public static void main(String[] args) {
			int[] sortArr={4, 2, 9, 1, 3, 8, 5};
			int[] result=quickSort(sortArr, 0, sortArr.length-1);
			for (int i:result) {
				System.out.print(i+" ");
			}

		}

	}


