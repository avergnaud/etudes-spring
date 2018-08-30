package com.poc;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class BeanPostProcessorHelloWorld implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("BeanPostProcessorHelloWorld.postProcessBeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("BeanPostProcessorHelloWorld.postProcessAfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}