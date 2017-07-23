package cn.echo0.run;

import cn.echo0.bean.Lan;
import cn.echo0.bean.Pen;
import cn.echo0.bean.People;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/23/2017 08:28 PM
 */
public class AdvancedDependcyManage {
    public static void main(String[] args) {
        AbstractApplicationContext ctx =new ClassPathXmlApplicationContext("application-context.xml","advanceDependcy-manage.xml");
        People myFavoritePeople = (People) ctx.getBean("theMostFavoritePeople");
        System.out.println(((Lan)myFavoritePeople).getRelName());
        Pen pen = (Pen) ctx.getBean("pen");
        pen.usePen();
        ctx.registerShutdownHook();

    }
}
