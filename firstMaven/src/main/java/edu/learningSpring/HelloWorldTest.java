package edu.learningSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld hello = (HelloWorld) context.getBean("hello");
		hello.sayHello();
System.out.println(hello.sayHello());
	}

}
