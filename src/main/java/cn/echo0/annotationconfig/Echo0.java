package cn.echo0.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/27/2017 08:40 PM
 */
@Component("echo0")
@Lazy
@DependsOn("lan")
@Scope("singleton")
public class Echo0 implements Person{
    private String name="Oubd";
    @Autowired
    private Person favoritePeople ;
    private Resource properties;
    @Override
    public String toString() {
        return "Echo0{" +
                "name='" + name + '\'' +
                ", favoritePeople=" + favoritePeople +
                '}';
    }
    public void say() {
        favoritePeople.say();
    }
    @PostConstruct
    void init(){
        System.out.println(" initializing echo0 ...");
    }
    @PreDestroy
    void destroy(){
        System.out.println(" destroying echo0 ...");
    }
}
