package org.Collection.List;

import java.util.ArrayList;
import java.util.List;

class ArrayListDemo1 {
    public static void main(String[] args) {
        /**
         * ArrayList
         * 1. 查询速度快 ： 根据索引去查询元素的 查询数据通过地址值和索引定位，查询任意数据耗时相同
         * 2. 删除数据低 ：可能需要把后面很多元素前移动
         * 3. 添加效率极低 ：可能需要把后面很多的元素后移动，再添加元素；后者也可能需要扩容
         */
        List<String> list = new ArrayList<>();
    }
}
