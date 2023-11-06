package org.base.day5_exception;

import java.util.Scanner;

/**
 * 捕获异常 并尝试修复
 */
public class E23 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(inputDouble());
                break;
            } catch (Exception e) {
                System.out.println("请输入合法数字");
            }
        }
    }

    public static double inputDouble(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字");
            double d =scanner.nextDouble();
            if (d>0){
                return d;
            }else{
                System.out.println("你输入的价格是不合适的");
            }
        }

    }
}
