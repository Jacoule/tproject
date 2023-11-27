package org.thred.sycronized_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String id;
    private double money;
    // 创建了一个锁对象 使用 final 修饰
    private final Lock lk = new ReentrantLock();

    public Account(String id, double money) {
        this.id = id;
        this.money = money;
    }
    public void drawMoney(double money){
        lk.lock();
        // 竞争一个对象资源 ,此处为 Account 对象
        try {
            if(this.money>=money){
                System.out.println(Thread.currentThread().getName()+"来取钱");
                this.money-=money;
                System.out.println(Thread.currentThread().getName()+"取钱成功，余额"+this.money);
            }else{
                System.out.println(Thread.currentThread().getName()+"来取钱余额不足~");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }

    }
    /**
     * 静态方法推荐使用 字节码 (class) 作为锁
     */
    public static void test(){
        synchronized (Account.class) {

        }
    }

    /**
     * 实例方法 推荐使用 this
     * @param
     */

    public void setId(String id) {
        this.id = id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public double getMoney() {
        return money;
    }
}
