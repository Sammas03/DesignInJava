package structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceImplDynamicProxy implements InvocationHandler {
    private Object service;

    public OrderServiceImplDynamicProxy(Object service) {
        this.service = service;
    }

    public Object bind(){
        return Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事物");
        Object instance = method.invoke(service,args);
        System.out.println("提交事物");
        return instance;
    }
}
