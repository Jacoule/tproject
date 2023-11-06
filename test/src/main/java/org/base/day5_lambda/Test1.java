package org.base.day5_lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class Test1 {
    /**
     * Lambda 用于简化匿名内部类的代码书写
     * （ 被重写方法的形参列表 ） ->{
     *     被重写方法的方法体代码
     *  }
     *
     *  只能简化函数式接口的匿名内部类（ 有且仅有一个 抽象方法的接口 ）
     *  @FunctionInterface
     *
     *  参数类型可以省略不写  如果只有一个参数 ，参数类型可以不写，（）也可以不写
     *  如果Lambda 表达式中的方法体代码只有一行代码，可以省略大括号不写 同时要省略分号
     *  如果是 return  必须去掉 return
     *
     */

    public static void main(String[] args) {
        double[] double1 = {1321.2,56456.2};
        Arrays.setAll(double1, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // return double1[value]+=0.1;  会出现问题
                return BigDecimal.valueOf(double1[value]).add(BigDecimal.valueOf(0.1)).doubleValue();
            }
        });

        Arrays.setAll(double1, value -> {
            // return double1[value]+=0.1;  会出现问题
            return BigDecimal.valueOf(double1[value]).add(BigDecimal.valueOf(0.1)).doubleValue();
        });

        Arrays.setAll(double1, value ->
            BigDecimal.valueOf(double1[value]).add(BigDecimal.valueOf(0.1)).doubleValue()
        );
    }
}
