package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.tools.interfaces.CleaningTool;


@Component
@Primary
public class CleaningServiceImpl implements CleaningService {
	
	@Autowired
	private CleaningTool tool;

	public void clean() {
		System.out.println("Cleaning the house");
		tool.doCleanJob();
		
	}

	public void setTool(CleaningTool tool) {
		this.tool = tool;
	}
	
	public void init() {
		System.out.println("CleaningService preparing for work.");
		
	}
	
	public void destroy() {
		System.out.println("CleaningService cleaning up.");
	}
	

}
