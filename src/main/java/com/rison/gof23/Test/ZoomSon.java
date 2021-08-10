package com.rison.gof23.Test;

/**
 * @author : Rison 8/9/21 9:01 PM
 */
public class ZoomSon extends Zoom{
    public ZoomSon(String name) {
        System.out.println(super.name);
        this.name = name;
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        new ZoomSon("B");
    }
}
