package com.testedu.class10;

import com.testedu.class10.Animal;
import com.testedu.class10.Human;
import com.testedu.class10.Dog;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 父类对象使用不同的子类完成实例化
		Animal man = new Human(130, 176);
		Human man1= new Human(130, 176);
		Animal dog = new Dog(85, 136);
		man.eat();
		dog.eat();
		man.sleep();
		dog.sleep();
		man.play();
		man1.play("足球");
		dog.play();
       zs(man);
       zs(dog);
       
       Human hm= new Human(90,130);
       zs(hm);
       //man.eat("米饭");
       Human hum=(Human)man;
       hum.makeTools();
	}

	public static void zs(Animal f) {
		System.out.println(f.weight);

	}
}
