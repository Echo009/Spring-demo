package cn.echo0.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;


/**
 * Author : Ech0
 * Email  : ech0.extreme@foxmail.com
 * Time   : 07/29/2017 07:41 PM
 */
@Aspect
public class LanAspect {
    @Before(value = "PointCutDefinition.lanSleep()")
    public void sayGoodNightToLan() {
        System.out.println("em . . .");

    }

    @AfterReturning(pointcut = "PointCutDefinition.lanSing()", returning = "words")
    public void handClapForIt(String words) {
        System.out.println(words);
        System.out.println("it is great song !");
    }

    @AfterThrowing(pointcut = "PointCutDefinition.lanIll()", throwing = "ex")
    public void careForLan(Exception ex) {
        System.out.println(ex.getMessage());
        System.out.println("Do not worry , i will care for you .");
    }

    @After(value = "PointCutDefinition.lanSleep()")
    public void em() {
        System.out.println("Goodnight ! lanlan ~ ");
    }

    @Around(value = "PointCutDefinition.test()")
    public void testEnhancement(ProceedingJoinPoint point) throws Throwable {
        System.out.println(" before invoking method ...");
        System.out.println("getSignature :" + point.getSignature());
        System.out.println("getArgs :"+ Arrays.toString(point.getArgs()));
        System.out.println("getTarget :"+point.getTarget());
        System.out.println("getThis :"+ point.getThis().getClass());
        Object returnValue=point.proceed();
        System.out.println(returnValue);
        System.out.println(" after invoking method ...");
    }

}
