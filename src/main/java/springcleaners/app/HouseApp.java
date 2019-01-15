package springcleaners.app;

import springcleaners.tools.impl.Broom;
import springcleaners.tools.impl.CleaningServiceImpl;
import springcleaners.tools.impl.VacuumCleaner;
import springcleaners.tools.interfaces.CleaningTool;

public class HouseApp {

	public static void main(String[] args) {
		CleaningTool broom = new Broom();
		CleaningTool vacuum = new VacuumCleaner();
		
		CleaningServiceImpl jill = new CleaningServiceImpl();
		jill.setTool(broom);
		CleaningServiceImpl jane = new CleaningServiceImpl();
		jane.setTool(vacuum);
		
		jill.clean();
		jane.clean();
		
		

	}

}
