package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.aspects.StatisticAspect;
import app.core.clients.Administrator;
import app.core.clients.Customer;

public class App1 {

	public static void main(String[] args) {
		
	try (
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		)
	{
		//start asking the container for beans
		System.out.println("start App1");
		Administrator admin = ctx.getBean(Administrator.class);
		System.out.println(admin.getClass());
		admin.greet();
		Customer customer = ctx.getBean(Customer.class);
		customer.greet();
		admin.addUser(5);
		admin.addManager();
		customer.addUser(6);
		customer.addManager();
				
		StatisticAspect statisticAspect = ctx.getBean(StatisticAspect.class);
		System.out.println("count = " + statisticAspect.getCounter());
	}

		System.out.println("end App1");
	}

}
