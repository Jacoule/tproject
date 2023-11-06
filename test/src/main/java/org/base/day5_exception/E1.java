package org.base.day5_exception;

public class E1 {
    /**
     * 自定义运行时异常
     * @param args
     */

    public static void main(String[] args) {
        //1 运行不下去
        /*
        try {
            saveAge(160);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */


        try {
            saveAge(160);
            System.out.println("没有问题");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层异常");
        }
        System.out.println("end");

        System.out.println("===================");


        try {
            saveAge2(400);
            System.out.println("成功");
        } catch (AgeIlleagleException e) {
            e.printStackTrace();
            System.out.println("编译时异常");
        }
        System.out.println("end");


    }
    public static void saveAge(int age){
        if (age>0 && age<150){
            System.out.println("successful");
        }else{
            throw new AgeIlleagleRuntimeException(" Age Illeagle ："+age);
        }
    }

    public static void saveAge2(int age) throws AgeIlleagleException{
        if (age>0 && age<150){
            System.out.println("successful");
        }else{
            throw new AgeIlleagleException(" Age Illeagle ："+age);
        }
    }

}
