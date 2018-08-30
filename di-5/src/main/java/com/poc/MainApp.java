package com.poc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

      Something obj = context.getBean("smthng", Something.class);
      System.out.println("client : " + obj.getClient().getId());
   }
}