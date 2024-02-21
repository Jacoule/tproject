package org.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Authere:hezx
 * @Date:2024/2/21 21:17
 */
public class AnimalProxy {
    public static Animal createProxy(Animal animal) {
        Animal animalProxy = (Animal) Proxy.newProxyInstance(AnimalProxy.class.getClassLoader(), new Class[]{Animal.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                Object obj = method.invoke(animal,args);
                Thread.sleep(1000);
                long end = System.currentTimeMillis();
                System.out.println(method.getName() + " 耗时 ：" + (end-start)/1000);
                return obj ;
            }
        });
        return animalProxy;
    }
}
