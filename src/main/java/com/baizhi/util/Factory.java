package com.baizhi.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asvs on 2019/10/31.
 */
public class Factory {
    private static ApplicationContext factory;

    static {
        factory = new ClassPathXmlApplicationContext("spring-core.xml");
    }

    public static <T> T getBean(Class<T> t) {
        return factory.getBean(t);
    }

}
