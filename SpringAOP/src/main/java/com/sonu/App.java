package com.sonu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
//          Don't use
//        ApplicationContext con = new ClassPathXmlApplicationContext(AppConfig.class);
        Student st = con.getBean("student", Student.class);

//        we don't want to use this here'
//        new Human().wakeUp();
        st.study();
    }
}
