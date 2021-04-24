package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        //  Using ApplicationContext
            ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie2 = applicationContext.getBean("movie1", Movie.class);
            System.out.println(movie2);

           Movie movie3 = applicationContext.getBean("movie1", Movie.class);
           System.out.println(movie3);
           System.out.println(movie2==movie3);   // In case of singletone result comes true
                                                 // In case of prototype result comes false




    }
}
