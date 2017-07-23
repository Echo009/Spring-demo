package cn.echo0.factory;

import cn.echo0.bean.Dream;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/22/2017 12:30 AM
 */
public class SimpleFactory {
    public Dream genDream(String str){
        return new Dream(str);
    }
    public static Dream staticGenDream(){
        return new Dream();
    }
}
