package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Point;

public class SpringApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("isActive: " + ctx.isActive());
		
		Point p1 = ctx.getBean("point", Point.class);
		Point p2 = ctx.getBean("point",Point.class);
		p1.setX(100);
		p2.setX(200);
		
		System.out.println("bean: : " + p1);
		System.out.println("bean: : " + p2);
		
		Integer r1 = ctx.getBean(Integer.class);
		Integer r2 = ctx.getBean(Integer.class);
		Integer r3 = ctx.getBean(Integer.class);
		
		System.out.println("random: : " + r1);
		System.out.println("random: : " + r2);
		System.out.println("random: : " + r3);
		
		
		
		ctx.close();
		System.out.println("isActive: " + ctx.isActive() + ", isRunning: " + ctx.isRunning());
	}

}
