package springcleaners.tools.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import springcleaners.tools.interfaces.CleaningTool;

@Component
@Primary
@Order(1)
public class Broom implements CleaningTool{

	public void doCleanJob() {
		System.out.println("Brooooooom is scruubbbing");
		
	}
	
	

}
