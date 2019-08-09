package com.testedu.class9;

public class QuickSort {
		
		public static int[] quickSort(int[] a,int low,int high) {
			//指定左指针

			int left=low;
			//指定右指针
			int right=high;
			//以数组最左端作为基准值。
			int base=a[high];
			//外层循环条件，left=right时，表示整个数组已经遍历完成
			while(left<right)
			{
				//内层循环1：从右往左比的循环,进行交换时跳出循环，使用break来达到目的
				/**
				 * 从右往左进行比较，也需要进行循环，循环条件依然是left<right,当进行了一次交换之后，跳出该循环，但是依然需要从左向右比
				 * 注意：现在left下标的值就是基准值
				 */
				while(left<right) {
					// 如果右边的数大于基准值，则右指针往左移动，right--
					if(a[left]>base) {
						left++;
						
					}
					/**
					 * 如果left的值大于基准值，则交换当前left下标和right下标（基准值）的值，交换后基准值的位置调换到left下标所在位置
					 * 同时当前的left值放到了right下标位置，该位置不需要再比较，因此right--，并且跳出从左往右比的循环
					 * 一次循环结束，如果现在还没有遍历完所有的数，那么循环继续进行，重新开始从右往左比
					 */
					else {
						int tmp=a[left];
						a[left]=a[right];
						a[right]=tmp;
						right--;
						break;
					}
				}//内层循环1从右往左比的循环结束
				
				//内层循环2：从左往右比的循环，进行交换时跳出循环，使用break来达到目的
				/**
				 * 从左往右进行比较，也需要进行循环，循环条件依然是left<right，当进行一次交换之后，跳出该循环，一次循环操作结束
				 * 这时进行判断，如果遍历还没有全部完成，则再次开始外层循环操作，开始从右往左比较 注意：此时right下标的值就是基准值
				 */
				while(left<right) {
					// 如果left的值小于基准值，则不需调整，指针右移，left++
					if(a[right]<base) {
						right--;
					}
					/**
					 * 如果left的值大于基准值，则交换当前left下标和right下标（基准值）的值，交换后基准值的位置调换到left下标所在位置
					 * 同时当前的left值放到了right下标位置，该位置不需要再比较，因此right--，并且跳出从左往右比的循环
					 * 一次循环结束，如果现在还没有遍历完所有的数，那么循环继续进行，重新开始从右往左比
					 */
					else {
						int tmp=a[right];
						a[right]=a[left];
						a[left]=tmp;
						left++;
						break;
					}
				}
				
			}
			
			//递归调用
			// 设置递归条件，如果不满足，则递归结束
			// 如果数组最左端到基准值之间还有元素，则左边还没有排列完，继续递归排列
			if(low<right-1) {
				// 排列的数组的下标范围为最左端到拆完之后基准值所在位置的左边一位
				quickSort(a, low, right-1);
			}
			
			// 如果数组基准值到最末端之间还有元素，则右边还没有排列完，继续递归排列
			if (high > left + 1) {
				// 排列的数组的下标范围为拆完之后基准值右边一位元素到原数组最右一位
				quickSort(a, left + 1, high);
			}
			// 排列完成之后，不需要再做任何操作，这里是递归出口
			
			return a;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] sortArr={4, 2, 9, 1, 3, 8, 5};
		                      
			int[] result=quickSort(sortArr, 0, sortArr.length-1);
			for (int i:result) {
				System.out.print(i+" ");
			}

		}

	}


