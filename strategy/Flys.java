/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designpattern.strategy;

/**
 * @author paras.chawla
 * @version $Id: Flys.java, v 0.1 2021-03-06 11:09 PM paras.chawla Exp $$
 */
/*  The interface is implemented by many other
     subclasses that allow for many types of flying
     without effecting Animal, or Flys.

 Classes that implement new Flys interface
 subclasses can allow other classes to use
 that code eliminating code duplication

 I'm decoupling : encapsulating the concept that varies
*/
@FunctionalInterface
public interface Flys {
    String fly();
}

// Class used if the Animal can fly

class ItFlys implements Flys{

    public String fly() {

        return "Flying High";

    }

}

//Class used if the Animal can't fly

class CantFly implements Flys{

    public String fly() {

        return "I can't fly";

    }

}