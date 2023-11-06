package org.base.day2_enum;
//抽象枚举
public enum B {
    X(){
        @Override
        public void go() {
            System.out.println("hello haha ! ");
        }
    },Y("xiao"){
        @Override
        public void go() {
            System.out.println(getname()+"在跑 ~");
        }
    };

    private String name;
    //
    B() {
    }

    B(String name){
        this.name = name;
    }
    public abstract void go();

    public String getname(){
        return this.name;
    }

}
