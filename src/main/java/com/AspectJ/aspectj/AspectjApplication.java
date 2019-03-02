package com.AspectJ.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AspectjApplication {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring2.xml");
        iPhone xs=(iPhone)app.getBean("XS");
        xs.getInfo();
        xs.updateCode(1);
	}
}