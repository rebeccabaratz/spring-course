package app.core.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("point")
@Scope("prototype")
public class Point {
	
	{
		System.out.println("point created");
	}
	
	int x;
	int y;
	
}
