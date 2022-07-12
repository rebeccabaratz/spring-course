package app.core.clients;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	public void greet() {
		System.out.println("Hello from customer");
	}
	public void addUser(int id) {
		System.out.println("adding customer user");
	}
	public void addManager() {
		System.out.println("adding customer managers");
	}
}
