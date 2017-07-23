package cn.echo0.bean;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/22/2017 12:31 AM
 */
public class Dream {
    public  String str="Follow your heart !";
    @Override
    public String toString() {
        return "Dream{" +
                "str='" + str + '\'' +
                '}';
    }
    public Dream(){

    }
    public Dream(String str){
        this.str=str;
    }
}
