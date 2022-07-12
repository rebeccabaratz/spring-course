package app.core.beans.vehicles;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TurboEngine implements Engine{
	
	
	@Override
	public void start() {
		System.out.println("TurboEngine started");

	}

	@Override
	public void stop() {
		System.out.println("TurboEngine stopped");

	}

}
