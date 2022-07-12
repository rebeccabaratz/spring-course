package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StatisticAspect {
	
	private int counter;
	
	public  int getCounter() {
		return counter;
	}

	// 1. modifiers - any if not specified
	// 2. return type - * = any [mandatory]
	// 3. declaring type (package.class.) any if not specified
	// 4. parameter pattern [mandatory] - .. = all parameters, . = one parameter
	// 5. throw pattern
	@Before("execution(* add*(..))")
	public void countAddMethodsCall(JoinPoint jp) { // get access to joinpoint
		Object[] args = jp.getArgs();
		if (args.length > 0) {
			System.out.println("arg: " + args[0].getClass());
		}
		counter++;
		System.out.println(">>> stat: " + jp.getSignature().getName());
	}
}
