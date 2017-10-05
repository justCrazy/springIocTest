package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {

		Resource r = new FileSystemResource("src/main/resources/helloMessage.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Person person = (Person) f.getBean("person");
		String str = person.sayHello();
		System.out.println("the sentence is: "+str);
	}

}
