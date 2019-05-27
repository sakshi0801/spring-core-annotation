package com.stackroute.config;

import com.stackroute.awareInterface.ApplicationContextAwareDemo;
import com.stackroute.awareInterface.BeanFactoryAwareDemo;
import com.stackroute.awareInterface.BeanNameAwareDemo;
import com.stackroute.awareInterface.ResourceLoaderAwareDemo;
import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    private Actor actor;

    private Movie movie;
/*
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
*/

    /*@Bean(name="Actor2")
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
    }*/

    @Bean(name = "actor")
    public Actor getActor(){
        actor=new Actor();
        actor.setName("Akshay");
        actor.setGender("M");
        actor.setAge(50);
        return actor;
    }

    @Bean(name = "actor1")
    public Actor getActor1(){
        actor=new Actor();
        actor.setName("Tapsi");
        actor.setGender("F");
        actor.setAge(30);
        return actor;
    }

    @Bean(name = "Movie",autowire = Autowire.BY_NAME)
    public Movie getMovie(){
        return new  Movie(1,"Baby");
    }

    @Bean(name = "ApplicationContextAwareDemo")
    public ApplicationContextAwareDemo getApplicationContextAwareDemo(){
        return new ApplicationContextAwareDemo();
    }

    @Bean(name = "BeanFactoryAwareDemo")
    public BeanFactoryAwareDemo getBeanFactoryAwareDemo(){
        return new BeanFactoryAwareDemo();
    }

    @Bean(name = "BeanNameAwareDemo")
    public BeanNameAwareDemo getBeanNameAwareDemo(){
        return new BeanNameAwareDemo();
    }

    @Bean(name = "ResourceLoaderAwareDemo")
    public ResourceLoaderAwareDemo getResourceLoaderAwareDemo(){
        return new ResourceLoaderAwareDemo();
    }

    @Bean(name = "BeanLifeCycleDemo",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifeCycleDemo getBeanLifeCycleDemo(){
        return new BeanLifeCycleDemo();
    }

    @Bean(name = "BeanPostProcessorDemo")
    public BeanPostProcessorDemo getBeanPostProcessorDemo(){
        return new BeanPostProcessorDemo();
    }
}
