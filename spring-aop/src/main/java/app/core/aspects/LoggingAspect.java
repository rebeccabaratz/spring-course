package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	// aspect - a class with advice methods
	// advice is method that runs once  the joinpoint was called
	// advice is a method in aspect class to be run with joinpoints
	// joinpoint - a business method intercepted by advice
	// pointcut - a text expression for matching advice to joinpoints
	// pointcut expression - connects advice (aspect method)  to joinpoint (business method)
	// pointcut expression : execution(
	// modifiers - possible
	// return type
	// declaring type pattern - possible
	// method name pattern
	// parameter pattern
	// throws exception - possible
	// }
	// Advice types are - Before, After, After Returning, After throwing, Around
	
	// Annotations: @ASpect(on Aspect class), @Advice (on advice method), @EnableAspectJAutoProxy (on configuration class)
	 
	//@Before("execution(void greet())")
	//@Before("execution(* *.*(..))")
	@Before("execution(public void app.core.clients.Administrator.greet())")
	public void beforeGreet() {
		System.out.println(">>> beforeGreet");		
		
	}
	
}
