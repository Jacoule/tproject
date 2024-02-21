package org.proxy;

import java.sql.Time;
import java.util.concurrent.ConcurrentMap;

/**
 * @Authere:hezx
 * @Date:2024/2/21 21:17
 */
public class AnimalService implements Animal{

    @Override
    public String sing(String name) {
        System.out.println("sing  :" + name);
        return  "haha = ";
    }

    @Override
    public void eat(String name) {
        System.out.println("eat  :" + name);
    }
}
