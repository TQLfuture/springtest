package two.aop.service.impl;

import two.aop.service.ILogService;

public class LogService implements ILogService {
    public void after() {
        System.out.println("之后日志");
    }

    public void before() {
        System.out.println("之前日志");
    }
}
