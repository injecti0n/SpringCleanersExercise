package springcleaners.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcleaners.appconfig.AppConfig;
import springcleaners.services.interfaces.CleaningService;
import springcleaners.tools.impl.CleaningRobot;

public class HouseApp {

	public static void main(String[] args) {
		
		
		/*try(ConfigurableApplicationContext gtx = new AnnotationConfigApplicationContext(AppConfig.class)){
			
			System.out.println("Container initialized");
			DomesticService service = gtx.getBean("domesticService", DomesticService.class);
			service.runHouseHold();
			
		}catch(NullPointerException ex) {
			ex.getMessage();
		}*/
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);


		CleaningService robot= ctx.getBean(CleaningRobot.class);
		robot.clean();
			 
			
		
	}

}
