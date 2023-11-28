package com.itheima;


import org.junit.Test;

/**
 * @version 1.0
 */
public class Main extends A{
    public static void main(String[] args) {
        A a=new Main();
        a.pr();
    }

}

abstract class A{
    public A(){
        System.out.println("pouss");

    }
    protected void pr(){
        System.out.println("aaaaa");
    }
}
