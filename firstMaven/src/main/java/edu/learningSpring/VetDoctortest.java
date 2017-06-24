package edu.learningSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VetDoctortest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Doctor doc = (Doctor) context.getBean("vetDOC");
		doc.check();


	}
}
