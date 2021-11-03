package com.wolken.bus;

/**
 * Hello world!
 *
 */


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import com.wolken.bus.DI.Engine;

public class bus {
    String company;
    Engine engineType;

    public bus() {
        System.out.println("bus  class  called");
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public static void main(String[] args) {
        Resource resource=new ClassPathResource("bus.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        factory.getBean("bus");
    }
}
