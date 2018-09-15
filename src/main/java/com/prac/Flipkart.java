package com.prac;

import java.util.Random;

public class Flipkart {
    private Courier courier;

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public String purchase(String item[]){
        Random rad = new Random();
        int orderid = rad.nextInt(1000);
        String status = courier.deliver(orderid);
        return "Bill amount for" +" "+ orderid +" "+"is 7000" +" "+status;
    }
}
