package com.testedu.class11.wbit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.testedu.class11.LoginSample;

@RunWith(Parameterized.class)
public class LoginSampleTest {
	//创建ls对象
	private LoginSample ls;
	//用户名
	private String user;
	//密码
	private String pwd;
	//预期结果
	private String result;

	@Before
	public void setUp() throws Exception {
		System.out.println("————————测试开始————————");
		//实例化
		ls =new LoginSample();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("————————测试结束————————");
	}
	
	//构造函数，基于生成数据的格式，接收测试数据，赋值给成员变量。
	public LoginSampleTest(String caseName,String username,String password,String exResult) {
	//public LoginSampleTest(String username,String password,String exResult) {
		user=username;
		pwd=password;
		result=exResult;
	}
	
	@Parameters(name="{0}")
	public static Object[][] loginData(){
		return new Object[][] {
			{"登录成功用例","Roy","123456","恭喜您，登录成功"},
			{"用户名过短","ro","123456","参数错误！"},
			{"用户名过长","royroyroyroyroyroyroyroy","123456","参数错误！"},
			{"用户名特殊字符","@#@$!@$","123456","用户名或密码错误！"},
			{"密码过短","Roy","12","参数错误！"},
			{"密码过长","Roy","123456123456123456","参数错误！"},
			{"密码特殊字符","Roy","@#@$!@$","用户名或密码错误！"},
			{"用户名为空",null,"123456","参数错误！"},
			{"密码为空","Roy",null,"参数错误！"}
		};
	}
//	@Parameters(name="用户名{0}，密码{1},预期{2}")
//	public static Object[][] loginData(){
//		return new Object[][] {
//			{"Roy","123456","恭喜您，登录成功"},
//			{"ro","123456","参数错误！"},
//			{null,"123456","参数错误！"}
//		};
//	}
//	
	
	@Test
	public void testLogin() {
		ls.login(user, pwd);
		assertEquals(result, ls.resultMSG);
	}

}
