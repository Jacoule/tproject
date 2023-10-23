package org.example;

import static org.example.varff.i;

public class duotaitest {
    public static void main(String[] args) {
        Circle2 circle = new Circle2();

    }
}

class Circle{
    private int r;

    public Circle(){

    }

    public Circle(int r){
        this.r=r;
    }

    public void printe(){
        System.out.println("无法调用"+i);
    }
}

class Circle2 extends Circle implements varff{
    public Circle2(){
    }

}
 interface varff{
    public static final int i=9;
}
