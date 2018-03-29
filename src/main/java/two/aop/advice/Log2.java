package two.aop.advice;

public class Log2 {

    public void before(){
        System.out.println("log2之前");
    }

    public void after(){
        System.out.println("log2之后");
    }
}
