package com.prac;

public class DTDC implements Courier{

    @Override
    public String deliver(int orderid) {
        return "Dtdc is ready to deliver product"+" "+orderid;
    }
}
