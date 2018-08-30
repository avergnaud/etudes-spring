package com.poc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld implements InitializingBean, DisposableBean {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    @PostConstruct
    public void tmpTest() {
        System.out.println("JSR250 PostConstruct");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet");
    }
    public void init(){
        System.out.println("XML-based configuration init-method OR Java configuration, initMethod attribute of @Bean");
    }
    @PreDestroy
    public void tmpDest() {
        System.out.println("JSR250 PreDestroy");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }
    public void myDestroy() throws Exception {
        System.out.println("XML-based configuration destroy-method OR Java configuration, destroyMethod attribute of @Beany");
    }
}