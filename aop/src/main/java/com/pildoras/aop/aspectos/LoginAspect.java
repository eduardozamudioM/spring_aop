package com.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    @Pointcut("execution(public void insertClient(..))")
    private void encapsulateClientAspect() {
    }


    //Example how the take pointexecute with only especific method
    @Before("encapsulateClientAspect()")
    public void beforeInsterClient() {
        System.out.println("The user has been loggin");
        System.out.println("The profile has a corret configuration for be client");
    }


    @Before("encapsulateClientAspect()")
    public void requerimentsClient() {
        System.out.println("The client is allowed to add at BD ");
    }

    @Before("encapsulateClientAspect()")
    public void requerimentTable() {
        System.out.println("has less 3000 in the table , you can insert the new client");
    }


    //--------------

    @Before("execution(public String com.pildoras.aop.dao.ClientSingleDao.insertClient(..))")
    public void beforeInsertClientWithParams() {
        System.out.println("The user has been loggin with params");
        System.out.println("The profile has a corret configuration for be client----");
    }


// This is a example how the aspect take everything after the asteric and apply the fuction in all methods
//    @Before("execution(public void insertClient*()")
//    public void beforeInsterClient(){
//        System.out.println("The user has been loggin");
//        System.out.println("The profile has a corret configuration for be client");
//
//    }


}
