package com.testedu.class11.wbit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

import com.testedu.class11.LoginSample;

public class TestLogin {
	
	private static LoginSample ls;

	
	//在测试类开始执行之前，先实例化被测类对象，以供调用，完成环境初始化
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ls=new LoginSample();
	}
	//测试之后的环境清理
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("测试类执行之后的操作");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("————————测试开始————————");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("————————测试结束————————");
	}

	//测试的方法，也就是用例
	@Test
	//正常登录测试
	public void normalTest() {
		boolean bResult=ls.login("Roy", "123456");
		assertTrue(bResult);
		assertEquals("恭喜您，登录成功", ls.resultMSG);
	}
	
	@Test
	//用户名过短测试
	public void errorTest1() {
		ls.login("ro", "123456");
		assertTrue(ls.resultMSG.contains("参数错误！"));
	}
	@Test
	//用户名过短测试
	public void errorTest2() {
		ls.login("r", "123456");
		assertTrue(ls.resultMSG.contains("参数错误！"));
	}
	@Test
	//用户名大小写
	public void errorTest3() {
		ls.login("roy", "123456");
		assertTrue(ls.resultMSG.contains("用户名或密码错误！"));
	}
	@Test
	//用户名过长
	public void errorTest4() {
		ls.login("royroyroyroyroyroyroy", "123456");
		assertTrue(ls.resultMSG.contains("参数错误！"));
	}
	@Test
	//特殊字符
	public void errorTest5() {
		ls.login("@#@$!@$", "123456");
		assertTrue(ls.resultMSG.contains("用户名或密码错误！"));
	}
	@Test
	//密码过短
	public void errorTest6() {
		ls.login("Roy", "r");
		assertTrue(ls.resultMSG.contains("参数错误！"));
	}
	@Test
	//密码过短
	public void errorTest7() {
		ls.login("Roy", "1234");
		assertTrue(ls.resultMSG.contains("用户名或密码错误！"));
	}
	@Test
	//密码过长
	public void errorTest8() {
		ls.login("Roy", "1234456789");
		assertTrue(ls.resultMSG.contains("密码错误"));
	}
	@Test
	//用户名为空
	public void nullTest1() {
		ls.login(null, "123456");
		assertTrue(ls.resultMSG.contains("参数错误！"));
	}
	@Test
	//用户名为空
	public void nullTest2() {
		ls.login("Roy", null);
		assertTrue(ls.resultMSG.contains("参数错误！"));
	}
	

}
