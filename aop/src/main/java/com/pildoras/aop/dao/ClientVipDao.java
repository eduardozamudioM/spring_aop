package com.pildoras.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClientVipDao {

    public void insertClient(){
        System.out.println("The client VIP is add at the DB");
    }
}
