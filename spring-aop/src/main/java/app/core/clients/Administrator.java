package app.core.clients;

import org.springframework.stereotype.Component;

@Component
public class Administrator {

	public void greet() {
		int x = 5;
		System.out.println("Hello from admin");
	}
	public void addUser(int id) {
		System.out.println("adding user");
	}
	public void addManager() {
		System.out.println("adding managers");
	}
}
