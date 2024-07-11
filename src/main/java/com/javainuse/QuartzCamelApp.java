package com.javainuse;


import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class QuartzCamelApp {

    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new QuartzCamelRoute());
        context.start();
        Thread.sleep(10000); // Let it run for 10 seconds
        context.stop();
    }
}

