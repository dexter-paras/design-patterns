/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designpattern.strategy;

/**
 * @author paras.chawla
 * @version $Id: Dog.java, v 0.1 2021-03-06 11:10 PM paras.chawla Exp $$
 */
public class Bird extends Animal {

    public Bird(){
        super();
        setSound("Bark");
        flyingType = ()-> "Can Fly";
    }

    /* BAD
	* You could override the fly method, but we are breaking
	* the rule that we need to abstract what is different to
	* the subclasses
	*
	public void fly(){

		System.out.println("I can't fly");

	}
	*/

}