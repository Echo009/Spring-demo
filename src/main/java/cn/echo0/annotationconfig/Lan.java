package cn.echo0.annotationconfig;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/27/2017 08:40 PM
 */
@Component("lan")
public class Lan implements Person{
    String name="lanlan";
    String sex="girl";
    String feature ="very cute !";
    @Override
    public String toString() {
        return "Lan{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", feature='" + feature + '\'' +
                '}';
    }

    public void say() {
        System.out.println(" Are you happy ?");
    }

    public void sleep(){
        System.out.println("em , i am sleepy ~ QAQ  ");
    }
    public String sing(){
        return " See you at next intersection !";
    }
    public String ill() throws Exception {
        throw new Exception("i catch a cold ~ ");
    }
    @Cacheable
    public String test(){
        return ( " run test ...");
    }
}
