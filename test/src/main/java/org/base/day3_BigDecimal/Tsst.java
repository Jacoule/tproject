package org.base.day3_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tsst {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.3;
        System.out.println(d1+d2);
        //掌握浮点类型小数运算失真的问题
        BigDecimal number1 = new BigDecimal(Double.toString(d1));
        //推荐以下方式   把小数转成字符串再运算
        BigDecimal number2 = BigDecimal.valueOf(d2);

        // 加法
        BigDecimal c = number1.add(number2);
        // 减法
        BigDecimal e = number1.subtract(number2);
        //  除法
        BigDecimal d = number1.divide(number2,2, RoundingMode.HALF_UP);
        //  乘法
        BigDecimal h = number1.multiply(number2);
        System.out.println(d);

        c.doubleValue();
    }
}
