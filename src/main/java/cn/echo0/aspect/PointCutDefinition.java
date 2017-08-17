package cn.echo0.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/29/2017 09:12 PM
 */
//切入点定义类
@Aspect
public class PointCutDefinition {
    @Pointcut("execution(* cn.echo0.annotationconfig.Lan.sleep(..))")
    public void lanSleep(){

    }
    @Pointcut("execution(* sing(..))")
    public void lanSing(){

    }
    @Pointcut("execution(* *ill(..))")
    public void lanIll(){

    }
    @Pointcut("execution(* *test(..))")
    public void test(){

    }
    @Pointcut("execution(* *.*do(..))")
    public void anyEndWithDo(){

    }
    @Pointcut("execution(* *.*(..) throws *)")
    public void anyThrowException(){

    }
    @Pointcut("within(cn.echo0.annotationconfig.*)")
    public void anyMethodInAnnotationPackage(){

    }
    @Pointcut("(within(cn.echo0.annotationconfig.*))&&args(cn.echo0.bean.Lan)!:args(cn.echo0.bean.Echo0)")
    public void compositionTest(){

    }
}
