package com.Test;

import com.prac.Flipkart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:/dtdc/src/main/java/com/prac/applicationcontext.xml");
        Flipkart fk=(Flipkart)context.getBean("flip");
        String billing = fk.purchase(new String[]{"shirt","mobile","dress","watch"});
        System.out.println(billing);
    }
}
