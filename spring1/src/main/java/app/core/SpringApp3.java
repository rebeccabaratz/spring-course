package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import app.core.beans.Shape;
import app.core.beans.vehicles.Car;
import app.core.beans.vehicles.TurboEngine;
import app.core.beans.vehicles.Vehicle;

@ComponentScan
@Configuration
@PropertySource("application.properties")
public class SpringApp3 {
	

	public static void main(String[] args) throws Exception {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp3.class);) {
			
			String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
			for (String string : beanDefinitionNames) {
				System.out.println(string);
			}
			Thread.sleep(3000);
			
		}

	}

}
