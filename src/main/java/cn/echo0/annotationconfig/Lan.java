package cn.echo0.annotationconfig;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/27/2017 08:40 PM
 */
@Component
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
}
