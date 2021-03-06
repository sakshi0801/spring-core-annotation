package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie1=(Movie) ctx.getBean("Movie1");
        System.out.println(movie1.getActor().getName()+" acted in "+movie1.getMovieName());
        //System.out.println(movie1);

        Movie movie2=(Movie) ctx.getBean("Movie2");
        System.out.println(movie2.getActor().getName()+" acted in "+movie2.getMovieName());
        //System.out.println(movie2);

    }
}
