package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.Studnet;

public class TsetStudent {

	@Test
	public void run(){
		String config="applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Studnet studnet = ac.getBean("studnet",Studnet.class);
		studnet.show();
	
	}
}
