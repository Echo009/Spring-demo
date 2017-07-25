package cn.echo0.run;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/25/2017 09:11 PM
 */
public class SimpleSchemaConfigTest {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("context-schema.xml");
        System.out.println(ctx.getBean("echo0"));
    }
}
