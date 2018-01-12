package com.shsxt.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *  声明 切面
 * @author Mr.YongGan.Zhang
 */

@Component
@Aspect
public class LogCut {
	
	@Pointcut ("execution (* com.shsxt.service..*.*(..))")
	public void cut () {}
	
	/**
	 * 前置通知 
	 */
	@Before(value = "cut ()")
	public void before () {
		System.out.println(" 前置增强。。 ");
	}
	
	/**
	 * 最终通知
	 */
	@After(value = "cut ()")
	public void after () {
		System.out.println(" 最通知。。。 ");
	}
	
	/**
	 * 返回通知
	 */
	
	@AfterReturning(value = "cut ()"  )
	public void afterReturning () {
		System.out.println(" 返回通知  ");
	}
	
	/**
	 * 异常
	 * @param e
	 */
    @AfterThrowing(value="cut()",throwing="e")
    public void afterThrowing(Exception e){
        System.out.println("异常通知....方法执行异常时执行:"+e);
    }
    

	
}
