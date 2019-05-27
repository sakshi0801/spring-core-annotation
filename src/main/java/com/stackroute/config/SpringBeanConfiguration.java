package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    private Actor actor;

    @Bean(name="Actor1")
    public Actor getActor1(){
        actor=new Actor();
        actor.setAge(25);
        actor.setGender("F");
        actor.setName("Alia");
        return actor;
    }

    @Bean(name="Movie1")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie getMovie1(){
        return new Movie(1,"Raazi",getActor1());
    }

    @Bean(name="Actor2")
    public Actor getActor2(){
        actor=new Actor();
        actor.setAge(30);
        actor.setGender("M");
        actor.setName("Varun");
        return actor;
    }

    @Bean(name={"Movie2","Movie3"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Movie getMovie2(){
        return new Movie(2,"Judwa 2",getActor2());
    }
}
