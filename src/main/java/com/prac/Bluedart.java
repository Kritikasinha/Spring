package com.prac;

public class Bluedart implements Courier {
    @Override
    public String deliver(int orderid) {
        return "Bluedart is ready to deliver product"+ orderid;
    }
}
