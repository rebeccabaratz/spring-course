package app.core.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("Job A")
public class Job implements InitializingBean, DisposableBean, BeanNameAware {
	
	private String beanName;
	
	{
		System.out.println("Init");
	}
	
	public Job() {
		System.out.println("CTOR");
	}
	
	@Override
	public void setBeanName(String name) {
		
		this.beanName = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("afterPropertiesSet: bean: " + this.beanName );
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy");
		
	}



}
