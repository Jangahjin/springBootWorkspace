package com.zeus.common.aop;


import java.util.Date;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before; 
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class ServiceloggerAdvice {
//	//advice
//	@Before(("execution(* com.zeus.service.BoardService*.*(..))"))
//	public void starting(JoinPoint jp) {
//		log.info("*****>>start log");
//		log.info("*****>>start log"+jp.getSignature());
//		log.info("*****>>start log"+Arrays.toString(jp.getArgs()));
//	}
	
	/*
	 * @AfterReturning(pointcut =
	 * "execution(* com.zeus.service.BoardService*.*(..))", returning = "result")
	 * public void IogReturning(JoinPoint jp, Object result) {
	 * log.info("*****>>IogReturning");
	 * log.info("*****>>IogReturning"+jp.getSignature());
	 * log.info("*****>>IogReturning"+result); }
	 */
	
//	@AfterThrowing(pointcut = "execution(* com.zeus.service.BoardService*.*(..))", 
//			throwing = "e")
//	public void IogException(JoinPoint jp, Exception e) {
//		Date date = new Date();
//		log.info("*****>>IogException"+ (new Date().toString()));
//		log.info("*****>>IogException");
//		log.info("*****>>IogException :"+ jp.getSignature());
//		log.info("*****>>IogException :"+e);
//	}
//	
//	@After("execution(* com.zeus.service.BoardService*.*(..))")
//	public void endlog(JoinPoint jp) {
//		Date date = new Date();
//		log.info("*****>>endlog"+ (new Date().toString()));
//		log.info("*****>>endlog :"+ jp.getSignature());
//		log.info("*****>>endlog :"+jp.getArgs());
//	}
	
	@Around("execution(* com.zeus.service.BoardService*.*(..))")
	public Object timelog(ProceedingJoinPoint pjp) throws Throwable {
		//1. 시간을 설정
		long startTime = System.currentTimeMillis();
		
		//insert, update, delete, search, list, select 함수를 실행
		//log.info("*****>>timelog :"+ pjp.getSignature());
		//log.info("*****>>timelog :"+ Arrays.toString(pjp.getArgs()));
		Object result = pjp.proceed();
		
		//2. 종료 시간을 설정
		long stopTime = System.currentTimeMillis();
		log.info("*****>>timelog :"+pjp.getSignature().getName() +"=>"+(stopTime - startTime));
		return result;
	}

}
