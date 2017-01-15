package com.hello.test;

import org.junit.Test;

import com.hello.basic.Hello;

public class testHello {
	
	@Test
	public void test(){
		Hello hello = new Hello();
		String results = hello.sayHello("gacl");
		System.out.println(results);
	}

}
