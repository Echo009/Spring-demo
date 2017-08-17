package cn.echo0.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/19/2017 11:26 PM
 */
public class Lan implements People , BeanNameAware ,ApplicationContextAware, InitializingBean,DisposableBean{
    String relName;
    String favoriteColor;
    String feature;
    String beanName;
    public void setBeanName(String s) {
     beanName = s;
        System.out.println(getClass() + " setting beanName");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println( "initialzing ... (interface)");
    }
    void init(){
        System.out.println("initialzing ... (init-method)");
    }

    public void destroy() throws Exception {
        System.out.println("destroying ... (interface)");
    }
    public void close(){
        System.out.println("destroying ... (destroy-method)");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(" setting applicationContext ~");
    }

    public class GetIll extends ApplicationContextEvent {

        /**
         * Create a new ContextStartedEvent.
         *
         * @param source the {@code ApplicationContext} that the event is raised for
         *               (must not be {@code null})
         */
        public GetIll(ApplicationContext source) {
            super(source);
            System.out.println(relName+"  get ill ");
        }
    }


    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        System.out.println("set property ~");this.relName = relName;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void say() {
        System.out.println(" Are you Happy ?");
    }

    public String name() {
        return getRelName();
    }
}
