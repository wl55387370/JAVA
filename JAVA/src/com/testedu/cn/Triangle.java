package com.testedu.cn;

public class Triangle {
	//杨辉三角

	public static void main(String[] args) {
		// 创建二维数组
		int len=11;
		 int triangle[][]=new int[len][len];
	        // 遍历二维数组的第一层
	        for (int i = 0; i < len; i++) {
	        
	        	// 初始化第二层数组的值
	            triangle[i]=new int[i+1];
	            
	            // 遍历第二层数组
	            for(int j=0;j<=i;j++){
	                // 将两侧的数组元素赋值为1
	                if(j==0||j==i){
	                    triangle[i][j]=1;
	                }else{// 其他数值通过公式计算
	                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
	                }
	         
	                           
	        }
	            }
	        for (int n=0;n< len;n++) {
				String formatln = "%" + (len - n) *2 + "s";
				System.out.format(formatln, "");
			for (int x = 0; x <= n; x++) {
			System.out.format("%-4d", triangle[n][x]);
		} 
        System.out.println();  
        }
	        }
	}
	


