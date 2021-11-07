package com.pildoras.aop.dao;

import com.pildoras.aop.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientSingleDao {


    public String insertClient(Client client, String type) {
        System.out.println("The client single String is add at the DB");
        return  "The client with string has been created";
    }
}
