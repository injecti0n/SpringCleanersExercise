package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.tools.interfaces.CleaningTool;

@Component("smith")
public class CleaningServiceWithVacuumCleanerImpl implements CleaningService{

	CleaningTool tool;
	
	public CleaningTool getTool() {
		return tool;
	}

	@Autowired
	public void setTool(@Qualifier("vacuum") CleaningTool tool) {
		this.tool = tool;
	}

	@Override
	public void clean() {
		tool.doCleanJob();
		
	}
	
	

}
