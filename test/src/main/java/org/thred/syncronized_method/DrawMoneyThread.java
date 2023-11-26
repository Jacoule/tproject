package org.thred.syncronized_method;

public class DrawMoneyThread extends Thread{
    private Account account;

    public DrawMoneyThread(Account acc, String name) {
        super(name);
        this.account = acc;
    }

    @Override
    public void run() {
        account.drawMoney(100);
    }
}
