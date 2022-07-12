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
public class SpringApp2 {
	

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp2.class);) {
			
			Shape shape = ctx.getBean(Shape.class);
			System.out.println(shape);
			
			Car v = ctx.getBean(Car.class);
			v.move();
			v.stop();
			
			Car turboCar = ctx.getBean("turboCar", Car.class);
			turboCar.move();
			turboCar.stop();
			System.out.println("maxSpeed: " + turboCar.getMaxSpeed());
		}	

	}

	@Bean
	public Car turboCar( @Value("${car.max.speed.turbo}") int maxSpeed) {
		Car car = new Car(new TurboEngine(), maxSpeed);		
		return car;		
	}
}
