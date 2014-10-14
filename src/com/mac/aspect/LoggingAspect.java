package com.mac.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Pointcut(value="execution(* get*(..))")
	public void allMethods() {}
	
	@Before(value="allMethods")
	public void logBefore() {
		System.out.println("Before advice executed.");
	}
	
	@After(value="allMethods")
	public void logAfter() {
		System.out.println("After advice executed.");
	}
	
	@Around(value="allMethods")
	public void logAround() {
		System.out.println("Around advice executed.");
	}

	@AfterReturning
	public void logAfterReturning() {
		System.out.println("After returning advice executed.");
	}
	
	@AfterThrowing
	public void logAfterThrowing() {
		System.out.println("After throwing advice executed.");
	}
}
