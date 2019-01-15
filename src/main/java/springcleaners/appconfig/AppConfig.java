package springcleaners.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.tools.impl.Broom;
import springcleaners.tools.impl.CleaningServiceImpl;
import springcleaners.tools.impl.VacuumCleaner;
import springcleaners.tools.interfaces.CleaningTool;

@Configuration
public class AppConfig {
	
	@Bean
	public CleaningTool broom() {
		return new Broom();
	}
	
	@Bean
	public CleaningTool vacuum() {
		return new VacuumCleaner();
	}
	
	
	@Bean
	public CleaningService jill() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setTool(broom());
		return cs;
	}
	
	@Bean
	public CleaningService jane() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setTool(vacuum());
		return cs;
		
	}
	
	

}