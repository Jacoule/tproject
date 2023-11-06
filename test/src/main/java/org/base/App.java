package org.base;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i=-1;
        System.out.println("初始值"+i);
        System.out.println(Integer.toBinaryString(i));
        i<<=1;
        System.out.println("位移后"+i);
        System.out.println(Integer.toBinaryString(i));
    }
}
