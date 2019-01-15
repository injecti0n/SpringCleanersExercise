package springcleaners.tools.impl;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.tools.interfaces.CleaningTool;

public class CleaningServiceImpl implements CleaningService {
	private CleaningTool tool;

	public void clean() {
		System.out.println("Cleaning the house");
		tool.doCleanJob();
		
	}

	public void setTool(CleaningTool tool) {
		this.tool = tool;
	}

}
