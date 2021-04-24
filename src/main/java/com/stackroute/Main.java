package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

         //  Using XmlBeanFactory
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie= xmlBeanFactory.getBean("movie1", Movie.class);
        System.out.println("List of Movie Actor --" + movie);

        //  Using ApplicationContext
            ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie2 = applicationContext.getBean("movie1", Movie.class);
            System.out.println(movie2);

    }
}
