package com.evg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Performer duke = (Performer)context.getBean("duke");
        duke.perform();
        Performer saxophonist = (Performer)context.getBean("sergio");
        saxophonist.perform();
        Performer onemanband1 = (Performer)context.getBean("weird-al");
        onemanband1.perform();
        Performer onemanband2 = (Performer)context.getBean("pinkie-pie");
        onemanband2.perform();
    }
}
