package com.testedu.class4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> testingMap = new HashMap<Integer,String>();
		testingMap.put(1,"roy");
		testingMap.put(2,"Will");
		testingMap.put(3,"土匪");
		testingMap.put(4,"琦琦");
		testingMap.put(5,"roy");
		System.out.println(testingMap);
		Set<Integer> testingSet=testingMap.keySet();
		
		System.out.println(testingSet);
		
		Iterator<Integer> keySetIt=testingSet.iterator();
		System.out.println("第一次去："+keySetIt.next()+"和"+keySetIt.next());
		System.out.println("第二次取："+keySetIt.next()+"和"+keySetIt.next());
		System.out.println("第3次取："+keySetIt.next()+"和"+keySetIt.next());

		
//		for(;keySetIt.hasNext();) {
//			System.out.println("键是："+keySetIt.next()+"值是"+testingMap.get(keySetIt.next()));
//		}
//		for(Integer a :testingSet) {
//			System.out.println(a +"的值是"+testingMap.get(a));
//		}
		

		
//		Iterator<Integer> keySetIt=testingSet.iterator();
//		for(;keySetIt.hasNext();) {
//			int key=keySetIt.next();
//			System.out.println("键是："+key+"值是"+testingMap.get(key));
//		}
		
		
	}
}
