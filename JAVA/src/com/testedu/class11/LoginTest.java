package com.testedu.class11;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginSample login=new LoginSample();
		//针对用户名参数设计的白盒测试用例。
		login.login(null, "123456");
		login.login("r", "123456");
		login.login("ro", "123456");
		login.login("roy", "123456");
		login.login("royroyroyroyroyroyroy", "123456");
		login.login("Roy", "123456");
		login.login("@#@$!@$", "123456");
		
		
		login.login("Roy", null);
		login.login("Roy", "r");
		login.login("Roy", "12");
		login.login("Roy", "123");
		login.login("Roy", "123333333333333333333");
	}

}
