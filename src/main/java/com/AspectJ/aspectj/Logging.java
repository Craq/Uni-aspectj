package com.AspectJ.aspectj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	@Before("execution(public * *Info())")
	public void requestInfo(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Request time: "+dateFormat.format(date));
	}
	@Before("appleMethods()")
	public void iphoneAdvice(){
		System.out.println("Apple fan over here");
	}
	@Before("samsMethods()")
	public void galaxyAdvice(){
		System.out.println("Samsung fan over here");
	}
	@Pointcut("within(com.AspectJ.aspectj.iPhone)")
	public void appleMethods(){}
	@Pointcut("within(com.AspectJ.aspectj.Galaxy)")
	public void samsMethods(){}
	
	@After("execution(public * com.AspectJ.aspectj.iPhone.updateCode(..))")
	public void changeModel(JoinPoint joinPoint){
		iPhone phone = (iPhone) joinPoint.getTarget();
		if (phone.code == 1){
			phone.name = phone.name+"I";
		}
		System.out.println("Updated to "+phone.name);
	}
}
