package org.Collection.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
    /**
     *  LinkedList 双链表
     *  单向链表数据结构 无论从那个数据开始查询都要从 头结点开始查询 元素在内存中不是连续的
     *  链表增删相对 ArrayList 较快
     *
     *  双向链表 查询慢，增删相对较快，但对首尾元素 进行增删改查的速度是极快的
     * @param args
     *
     * public void addFirst(E e) 在该链表开头插入指定的元素
     * public void addLast(E e)  在该链表末尾添加指定的元素
     * public E getFirst()  返回第一个元素
     * public E getLast()   返回最后一个元素
     * public E removeFirst()  删除第一个元素
     * public E removeLast()   删除最后一个元素
     */
    public static void main(String[] args) {

        //应用场景 设计队列（先进先出）  医院叫号 排队
        LinkedList<String> list = new LinkedList<>() ;
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.removeFirst();
        System.out.println(list);


        //应用场景 设计栈
        LinkedList<String> stack = new LinkedList<>() ;
        stack.addFirst("1");
        stack.push("2");
        stack.push("2");
        stack.removeFirst();
        stack.pop();

    }
}
