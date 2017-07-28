package cn.echo0.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/27/2017 08:06 PM
 */
public class SimpleBeanProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("before initialzation, enhancing "+ s + "  "+ o.getClass());
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("after initialzation, enhancing "+ s + "  "+ o.getClass());
        return o;
    }
}
