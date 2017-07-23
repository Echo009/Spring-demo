package cn.echo0.bean;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/23/2017 08:45 PM
 */
public class Pen {
    private  String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void usePen(){
        System.out.println("Using "+getColor()+"  pen...");
    }
}
