package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.entity.Book;


public class App 
{
    public static void main( String[] args )
    {
    	Resource r = new ClassPathResource("applicationContext.xml");
    	BeanFactory f = new XmlBeanFactory(r);
    	
    	Book b = (Book) f.getBean("aa");
    	b.display();
    }
}
