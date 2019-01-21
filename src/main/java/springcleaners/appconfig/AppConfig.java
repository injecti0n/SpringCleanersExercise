package springcleaners.appconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.services.interfaces.DomesticService;
import springcleaners.services.interfaces.GardeningService;
import springcleaners.tools.impl.Broom;
import springcleaners.tools.impl.CleaningServiceImpl;
import springcleaners.tools.impl.DomesticServiceImpl;
import springcleaners.tools.impl.GardeningServiceImpl;
import springcleaners.tools.impl.LawnMower;
import springcleaners.tools.impl.VacuumCleaner;
import springcleaners.tools.interfaces.CleaningTool;
import springcleaners.tools.interfaces.GardeningTool;

@Configuration
public class AppConfig {

	@Bean
	@Lazy
	@Scope("prototype")
	@Primary
	public CleaningTool broom() {// method to create new object; name of the bean
		return new Broom();
	}

	@Bean
	public CleaningTool vacuum() {// you use the same tool
		return new VacuumCleaner();
	}

	@Bean(name = "disposable")
	@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES) // every time you get a new one
	public CleaningTool disposableDuster() {
		return new DisposableDuster();
	}

	@Bean
	@Scope("prototype")
	public GardeningTool lawnmower() {
		return new LawnMower();
	}

	// services
	@Bean(autowire = Autowire.BY_TYPE)
	public CleaningService cleaningService() {
		return new CleaningServiceImpl();
	}

	@Bean(autowire = Autowire.BY_TYPE, initMethod = "init", destroyMethod = "destroy")
	public GardeningService gardeningService() {
		return new GardeningServiceImpl();
	}

	@Bean(name = "domesticService", autowire = Autowire.BY_TYPE)
	public DomesticService all() {
		return new DomesticServiceImpl();
	}
}