package com.gaf.exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExempleApplication {

	public static void main(String[] args) {
		var ctx =  SpringApplication.run(ExempleApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
		//System.out.println(myFirstService.getJavaVersion());
		//System.out.println(myFirstService.getOsName());
		//System.out.println(myFirstService.readProperty());

	}

	//@Bean
	//public MyFirstClass myFirstClass(){
	//	return new MyFirstClass();
	//}

}
