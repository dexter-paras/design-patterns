/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designpattern.strategy;

/**
 * @author paras.chawla
 * @version $Id: AnimalPlay.java, v 0.1 2021-03-06 11:13 PM paras.chawla Exp $$
 */
public class AnimalPlay {

    public static void main(String[] args) {

        Animal dog = new Dog();
        System.out.println("Dog: " +dog.tryToFly());

        Animal bird = new Bird();
        System.out.println("Bird: " +bird.tryToFly());
    }

}