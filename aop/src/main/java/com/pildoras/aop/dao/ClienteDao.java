package com.pildoras.aop.dao;


import org.springframework.stereotype.Component;

@Component
public class ClienteDao {


    public void insertClient(){
    System.out.println("The client is add at the DB");
    }
}
