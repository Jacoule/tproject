package org.proxy;

/**
 * @Authere:hezx
 * @Date:2024/2/21 21:14
 */

/**
 * 1、jdk动态代理
 *      -创建一个接口
 *      -创建一个类实现改接口
 *      -创建一个代理类（包含一个静态代理生成方法（返回一个接口） 通过接口）
 *              通过 Procy.newProxyInstance(_.class.getClassLoader() 当前类的类加载器 ,new Class[]{}  接口 ,
 *              new InvocationHandler() 的匿名内部类 重写 Object invoke( Object proxy, Method method, Object[] args) 方法)
 * 2、接口的引用 代理类调用代理生成方法生成代理
 */
public interface Animal {
    String sing(String name) ;
    void eat(String name);
}
