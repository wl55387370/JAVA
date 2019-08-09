package com.testedu.class11.wbit;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.testedu.class11.Plus;
@RunWith(Parameterized.class)
public class PlusTestDouble {
		private Plus p;
	//测试名
		public String caseName;
		//测试预期结果
		public String exResult;
		//测试用到的数据
		public int firstNum;
		public int secondNum;
		public double dN1;
		public double dN2;
		
	@Before
	public void setUp() throws Exception {
		System.out.println("=======测试开始=========");
		p= new Plus();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("=======测试结束=========");
		
	}
	public PlusTestDouble(String input1,String input2,int input3 ,int input4,double input5,double input6) {
		caseName=input1;
		exResult=input2;
		firstNum=input3;
		secondNum=input4;
		dN1=input5;
		dN2=input6;}

	@Parameters(name="{0},res:{1},operater:sum({2}{3})")
	public static Object[][] setData(){
		return new Object[][] {
			{"左边界-1","-2147483649",-2147483648,-1,12345.5,1},
			{"左边界+0","-2147483648",-2147483648,0,12346.6,1},
			{"左边界+1","-2147483647",-2147483648,1,12346.6,1}
		};
	}

	@Test 
	public void testDouble() {
		System.out.println(caseName);
		assertEquals(caseName,"12347.6", Double.toString(p.Sum(dN1, dN2)));
	}
}
