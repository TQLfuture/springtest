package three.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//使用cglib就是为了弥补动态代理的不足【动态代理的目标对象一定要实现接口】
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public CglibProxy(Object target){
        this.target = target;
    }

    public Object getCglibProxy(){
        //1. 工具类
        Enhancer en = new Enhancer();
        //2. 设置父类
        en.setSuperclass(target.getClass());
        //3. 设置回调函数
        en.setCallback(this);
        //4. 创建子类(代理对象)
        return en.create();
    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务.....");
        // 执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        System.out.println("提交事务.....");
        return returnValue;
    }
}
