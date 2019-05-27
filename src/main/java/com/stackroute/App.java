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

        Movie movie2=(Movie) ctx.getBean("Movie2");
        System.out.println(movie2.getActor().getName()+" acted in "+movie2.getMovieName());

        Movie movie3=(Movie) ctx.getBean("Movie1");
        System.out.println("Equality of objects when scope is prototype :"+(movie3==movie1));

        Movie movie4=(Movie) ctx.getBean("Movie2");
        System.out.println("Equality of objects when scope is singleton :"+(movie2==movie4));

        Movie movie5=(Movie)ctx.getBean("Movie3");
        System.out.println("By using two different name");
        System.out.println(movie5.getActor().getName()+" acted in "+movie5.getMovieName());

    }
}
