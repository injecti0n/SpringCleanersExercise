package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springcleaners.services.interfaces.GardeningService;
import springcleaners.tools.interfaces.GardeningTool;

@Component
public class GardeningServiceImpl implements GardeningService {
	
	private GardeningTool tool;

	public void setTool(GardeningTool tool) {
		this.tool = tool;
	}

	@Autowired
	public GardeningServiceImpl(GardeningTool tool) {
		super();
		this.tool = tool;
	}
	
	public void init() {
		System.out.println("GardeningService preparing for work.");
	}
	
	public void destroy() {
		System.out.println("GardeningService cleaning up.");
	}
	
	public void garden() {
		System.out.println("Working in the garden");
		tool.doGardenJob();
	}
	

}
