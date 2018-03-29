package two.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogAdvice implements MethodBeforeAdvice {
    /**
     * 前置通知
     * @param method
     * @param objects
     * @param target
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("前置通知");
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行");
    }
}
