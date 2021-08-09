package com.rison.gof23.single;

/**
 * @author : Rison 8/5/21 10:18 AM
 * 饿汉式-方式1 静态变量方式
 * 静态变量创建类对象
 * 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存的浪费
 */
public class Singleton {
    /**
     * 私有构造方法
     */
    private Singleton() {
    }

    /**
     * 在成员未知创建该类的对象
     */
    private static Singleton instance = new Singleton();

    /**
     * 对外提供静态方法获取该对象
     */
    public static Singleton getInstance(){
        return instance;
    }

}

/**
 * 在静态代码块中创建该类对象
 */

class Singleton2{
    //私有构造方法
    private Singleton2() {}

    //在成员位置创建该类的对象
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    //对外提供静态方法获取该对象
    public static Singleton2 getInstance() {
        return instance;
    }
}
