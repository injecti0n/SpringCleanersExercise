package springcleaners.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages="springcleaners")
public class AppConfig {

	
/*	@Bean
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
	}*/
}