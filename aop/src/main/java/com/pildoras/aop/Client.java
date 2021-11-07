package com.pildoras.aop;

public class Client {
    private String client;
    private String type;

    public Client() {
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client(String client, String type) {
        this.client = client;
        this.type = type;
    }
}
