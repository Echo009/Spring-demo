package cn.echo0.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/19/2017 11:23 PM
 */
public abstract class Echo0 implements People,ApplicationListener , ApplicationContextAware{
    private String favoritecolor;
    private String relName;
    private People favoritePeople;
    private List <String> responsibility;
    private ApplicationContext ctx;
    private Properties health;
    private HashSet music;
    private HashMap grade ;

    public abstract Food getFood();
    public HashSet getMusic() {
        return music;
    }

    public void setMusic(HashSet music) {
        this.music = music;
    }

    public HashMap getGrade() {
        return grade;
    }

    public void setGrade(HashMap grade) {
        this.grade = grade;
    }

    public Properties getHealth() {
        return health;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public ApplicationContext getCtx() {
        return ctx;
    }

    public void setCtx(ApplicationContext ctx) {
        this.ctx = ctx;
    }
    public Echo0(){

    }
    public Echo0(String favoritecolor, String relName, People favoritePeople, List<String> responsibility) {
        this.favoritecolor = favoritecolor;
        this.relName = relName;
        this.favoritePeople = favoritePeople;
        this.responsibility = responsibility;
    }

    public String getFavoritecolor() {
        return favoritecolor;
    }

    public void setFavoritecolor(String favoritecolor) {
        this.favoritecolor = favoritecolor;
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName;
    }

    public People getFavoritePeople() {
        return favoritePeople;
    }

    public void setFavoritePeople(People favoritePeople) {
        this.favoritePeople = favoritePeople;
    }


    public void loveLan(){
        favoritePeople.say();
    }

    public void say() {
        System.out.println("It is great to fall love with You ~ ");
    }

    public String name() {
        return getRelName();
    }

    @Override
    public String toString() {
        return "Echo0{" +
                "favoriteColor='" + favoritecolor + '\'' +
                ", relName='" + relName + '\'' +
                ", favoritePeople=" + favoritePeople.name() +
                ", responsibility=" + responsibility +
                ", ctx=" + ctx +
                ", health=" + health +
                ", music=" + music +
                ", grade=" + grade +
                '}';
    }

    public void setResponsibility(List responsibility) {
        this.responsibility = responsibility;
    }

    public List getResponsibility() {
        return responsibility;
    }

    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof Lan.GetIll){
            System.out.println("I will care for You , don`t worry about it !");
        }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        setCtx(applicationContext);
    }
    public void eatFood(){
        System.out.println("Eatting food  "+getFood());
    }
}
