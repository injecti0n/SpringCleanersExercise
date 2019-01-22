package springcleaners.tools.impl;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springcleaners.tools.interfaces.GardeningTool;

@Component
public class HedgeTrimmerFactory {
	
	
	@Bean
	@Primary
	public GardeningTool hedgeTrimmer() {
		int today  = LocalDateTime.now().getHour();
		
		if(today < 8 && today > 18) {
			return ()-> System.out.println("Work on!");
		}else {
			return ()->System.out.println("Take a break!");
		}
		
		
	}

}
