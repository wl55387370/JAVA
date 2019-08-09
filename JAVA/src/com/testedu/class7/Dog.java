package com.testedu.class7;

public class Dog {
	//成员变量
	public String name="豆豆";
	public String gender;
	//类变量
	public static final String KIND="犬科类"; 
    public String clore="黑色";
    public static String teeth="犬牙";
    public int age=0;
    
    public void bark(int age/*局部变量*/) {
    	if(age>9) { 
    		name="老豆";
    	System.out.println(name+"在"+"嗷嗷"+"叫");
    }
    	else if(age>=6&&age<9) {
    		name="大豆";
    		System.out.println(name+"在"+"汪汪"+"叫");	
    	}
    	else{
    		name="小豆豆";
    		System.out.println(name+"在"+"呜呜"+"叫");	
    	}
    	}
    //成员方法
    public void grow(int agel) {
    	age+=agel;
    	bark(age);
    }
    //类方法
    public static void eat() {
    	//System.out.println(name+"在啃骨头");
    	System.out.println(teeth+"在啃骨头");	
    }
    //构造方法
    public Dog() {
		
	}
   
}
