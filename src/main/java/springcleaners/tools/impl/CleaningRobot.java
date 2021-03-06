package springcleaners.tools.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.tools.interfaces.CleaningTool;

@Component
@Qualifier("robot")
public class CleaningRobot implements CleaningService{

	@Autowired	
	private List<CleaningTool> tools;
	
	public void clean() {
	
		System.out.println("cleaning the houses with a robot");
	
		tools.forEach(CleaningTool::doCleanJob);
		
	}

}