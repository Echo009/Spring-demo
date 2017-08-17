package cn.echo0.run;

import cn.echo0.bean.Dream;
import cn.echo0.bean.Echo0;
import cn.echo0.bean.Lan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/19/2017 11:41 PM
 */
public class SimpleInjection {
//    工厂方法（静态，实例）获取bean对象
    private static void factoryTest( AbstractApplicationContext ctx ){
        Dream plainDream =(Dream) ctx.getBean("plainDream");
        System.out.println(plainDream);
        Dream staticDream = (Dream)ctx.getBean("staticDream");
        System.out.println(staticDream);
    }
    private static void beanLifeCycle(AbstractApplicationContext ctx){
        Lan lan  = (Lan) ctx.getBean("lan");

    }
    public static void main(String[] args) {
        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("application-context.xml");
//        Echo0 echo0 = (Echo0) ctx.getBean("echo0");
//        echo0.loveLan();
//        echo0.say();
//        System.out.println(echo0);
//        //事件机制
//        ctx.publishEvent(((Lan)ctx.getBean("lan")).new GetIll(ctx));
//        System.out.println(ctx==echo0.getCtx());
////    管理作用域不同的bean之间的依赖
//        echo0.eatFood();
//        echo0.eatFood();
        ctx.registerShutdownHook();


    }
}
