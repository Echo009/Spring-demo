package cn.echo0.run;

import cn.echo0.annotationconfig.Lan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/29/2017 08:00 PM
 */
public class AopTest {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        Lan lan=ctx.getBean("lan",cn.echo0.annotationconfig.Lan.class);
        lan.sleep();
        lan.sing();
        try {
            lan.ill();
        } catch (Exception e) {
            // do nothing
            System.out.println("Echo0 !");
        }
        lan.test();
    }
}
