package com.testedu.class4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> testingMap = new HashMap<String,String>();
		testingMap.put("roy","胖");
		testingMap.put("Will","成熟");
		testingMap.put("土匪","专家");
		testingMap.put("琦琦","nice");
		testingMap.put("卡卡","小鲜肉");
		System.out.println(testingMap);
		//set集合遍历
		for(String i:testingMap.keySet()) {
			System.out.println(i+":"+testingMap.get(i));
		}
		System.out.println(" ");
		
		//通过入口
		System.out.println(" ==========");
		Iterator<String> it=testingMap.keySet().iterator();
		for(;it.hasNext();) {
			String key=it.next();
			System.out.println("键是："+key+"值是"+testingMap.get(key));
		}
		
		//for循环entrySet
		System.out.println(" ==========");
		Set<Entry<String, String>> ESet =testingMap.entrySet();
		for(Entry<String, String> s:ESet) {
			System.out.println("键是："+s.getKey()+"值是："+s.getValue());
		}
		
//		for(Entry<String, String> s:ESet) {
//			System.out.println(s);
//		}
		System.out.println(" ==========");
		Iterator<Entry<String, String>> it1=testingMap.entrySet().iterator();
		for(;it1.hasNext();) {
			Entry<String, String> key=it1.next();
			System.out.println("键是："+key.getKey()+"值是"+key.getValue());
		}
	}

}
