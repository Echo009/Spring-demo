package cn.echo0.run;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/27/2017 08:58 PM
 */
public class AnnotationTest {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("annotation-config.xml");
        cn.echo0.annotationconfig.Person echo0=(cn.echo0.annotationconfig.Echo0)ctx.getBean("echo0");
        echo0.say();
        System.out.println(ctx.getResource("classpath:echo0.properties").getURL());
        ctx.registerShutdownHook();
    }
}
