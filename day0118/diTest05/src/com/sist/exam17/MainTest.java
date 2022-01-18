package com.sist.exam17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sist/exam17/beans17.xml");
		//이 때 이미 객체가 생성 됨
		
		
		Person hong1 = (Person)context.getBean("hong"); 
		Person hong2 = (Person)context.getBean("hong");
		 
		if(hong1 == hong2) { 
			 System.out.println("서로 같은 메모리를 바라봅니다."); 
		}else {
			System.out.println("서로 다른 메모리를 바라봅니다."); 
		}
		 
	}

}
