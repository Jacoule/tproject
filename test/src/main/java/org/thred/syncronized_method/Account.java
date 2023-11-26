package org.thred.syncronized_method;

public class Account {
    private String id;
    private double money;

    public Account(String id, double money) {
        this.id = id;
        this.money = money;
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
     * @param money
     */
    public synchronized void drawMoney(double money){
        // 竞争一个对象资源 ,此处为 Account 对象
            if(this.money>=money){
                System.out.println(Thread.currentThread().getName()+"来取钱");
                this.money-=money;
                System.out.println(Thread.currentThread().getName()+"取钱成功，余额"+this.money);
            }else{
                System.out.println(Thread.currentThread().getName()+"来取钱余额不足~");
            }

    }
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
