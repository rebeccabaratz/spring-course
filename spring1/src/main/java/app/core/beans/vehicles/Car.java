package app.core.beans.vehicles;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{
	
	
	//@Resource
	//@Qualifier("turboEngine")
	//@Autowired
	private Engine engine;	
	private int maxSpeed;
	
//	public Car() {
//	}
	//@Autowired
//	public Car(Engine engine) {
//		super();
//		this.engine = engine;
//	}
	
	public Car(Engine engine, @Value("${car.max.speed}") int maxSpeed) {
		super();
		this.engine = engine;
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public void move() {
		engine.start();
		System.out.println("car is moving");
	}

	@Override
	public void stop() {		
		engine.stop();
		System.out.println("car stopped");
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

}
