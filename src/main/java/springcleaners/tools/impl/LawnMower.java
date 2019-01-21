package springcleaners.tools.impl;

import springcleaners.tools.interfaces.GardeningTool;

public class LawnMower implements GardeningTool{

	@Override
	public void doGardenJob() {
		System.out.println("mowing the lawn");
		
	}

}
