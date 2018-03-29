package two.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log3 {

   /* @Before("execution(* two.aop.service.impl.*.*(..))")
    public void before(){
        System.out.println("log3之前");
    }


    @After("execution(* two.aop.service.impl.*.*(..))")
    public void after(){
        System.out.println("log3之后");
    }*/

    @Around("execution(* two.aop.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        System.out.println("方法"+jp.getSignature());
        Object result=jp.proceed(); //方法的返回值
        System.out.println("result = " + result);
        System.out.println("环绕后");
        return result;
    }
}
