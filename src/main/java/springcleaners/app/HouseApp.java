package springcleaners.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcleaners.appconfig.AppConfig;
import springcleaners.services.interfaces.CleaningService;
import springcleaners.services.interfaces.DomesticService;

public class HouseApp {

	public static void main(String[] args) {
		/*
		 * CleaningTool broom = new Broom(); CleaningTool vacuum = new VacuumCleaner();
		 * 
		 * CleaningServiceImpl jill = new CleaningServiceImpl(); jill.setTool(broom);
		 * CleaningServiceImpl jane = new CleaningServiceImpl(); jane.setTool(vacuum);
		 * 
		 * jill.clean(); jane.clean();
		 */
		///// springggggg
		
		
	
/*/
 
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CleaningService jill = ctx.getBean("jill", CleaningService.class);
		CleaningService jane = ctx.getBean("jane", CleaningService.class);
		
		jill.clean();
		jane.clean();
		ctx.close();
 */
		
		
		try(ConfigurableApplicationContext gtx = new AnnotationConfigApplicationContext(AppConfig.class)){
			
			System.out.println("Container initialized");
			DomesticService service = gtx.getBean("domesticService", DomesticService.class);
			service.runHouseHold();
			
		}catch(NullPointerException ex) {
			ex.getMessage();
		}
		
	}

}
