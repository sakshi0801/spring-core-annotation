package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name="Actor1")
    public Actor getActor1(){
        return new Actor("Alia","F",25);
    }

    @Bean(name="Movie1")
    public Movie getMovie1(){
        return new Movie(1,"Raazi",getActor1());
    }

    @Bean(name="Actor2")
    public Actor getActor2(){
        return new Actor("Varun","M",30);
    }

    @Bean(name="Movie2")
    public Movie getMovie2(){
        return new Movie(2,"Judwa 2",getActor2());
    }
}
