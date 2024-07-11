package com.javainuse;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.quartz.QuartzComponent;

public class QuartzCamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        QuartzComponent quartz = getContext().getComponent("quartz", QuartzComponent.class);
        quartz.setPropertiesFile("quartz.properties");

        from("quartz://myGroup/myTimerName?cron=0+0/5+*+*+?")
                .to("log:quartz?showBody=true&showHeaders=true");
    }
}

