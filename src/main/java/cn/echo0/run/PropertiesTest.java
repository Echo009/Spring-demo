package cn.echo0.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/27/2017 08:28 PM
 */
public class PropertiesTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("property-placeholder.xml");
        System.out.println(ctx.getBean("echo0"));
    }
}
