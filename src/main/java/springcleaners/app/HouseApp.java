package springcleaners.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import events.LunchEvent;
import springcleaners.appconfig.AppConfig;
import springcleaners.services.interfaces.CleaningService;
import springcleaners.services.interfaces.DomesticService;
import springcleaners.services.interfaces.GardeningService;
import springcleaners.tools.impl.CleaningRobot;
import springcleaners.tools.interfaces.GardeningTool;

public class HouseApp {

	public static void main(String[] args) {

		/*
		 * try(ConfigurableApplicationContext gtx = new
		 * AnnotationConfigApplicationContext(AppConfig.class)){
		 * 
		 * System.out.println("Container initialized"); DomesticService service =
		 * gtx.getBean("domesticService", DomesticService.class);
		 * service.runHouseHold();
		 * 
		 * }catch(NullPointerException ex) { ex.getMessage(); }
		 */

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CleaningService smith = ctx.getBean("smith", CleaningService.class);
		smith.clean();

		System.out.println("-------------");

		CleaningService smithx = ctx.getBean(CleaningService.class);
		smithx.clean();

		System.out.println("-------------");

		CleaningService robot = ctx.getBean(CleaningRobot.class);
		robot.clean();
		
		System.out.println("-------------");
		
		DomesticService house = ctx.getBean(DomesticService.class);
		house.runHouseHold();
		ctx.publishEvent(new LunchEvent(30));

	}

}
