package com.gaf.exemple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    //private Environment environment;


    public MyFirstService(
            @Qualifier("bean1")  MyFirstClass myFirstClass)
    {
        this.myFirstClass = myFirstClass;
    }

    //@Autowired   di
    //public void injectDependencies(
    //        @Qualifier("bean3") MyFirstClass myFirstClass){
    //    this.myFirstClass=myFirstClass;
    //}

    //@Autowired       setter
    //public void setMyFirstClass( @Qualifier("bean1") MyFirstClass myFirstClass) {
    //    this.myFirstClass = myFirstClass;
    //}

    public String tellAStory(){
        return "the dependency is saying : "+ myFirstClass.sayHello();
    }
    //public String getJavaVersion(){
    //    return environment.getProperty("java.version");
    //}
    //public String getOsName(){
    //    return environment.getProperty("os.name");
    //}
    //public String readProperty(){
    //    return environment.getProperty("my.custom.property");
    //}

    //@Autowired
    //public void setEnvironment(Environment environment) {
    //    this.environment = environment;
    //}
}
