package springcleaners.tools.impl;

import org.springframework.stereotype.Component;

import springcleaners.tools.interfaces.GardeningTool;

@Component(value="mowie")
public class LawnMower implements GardeningTool{

	@Override
	public void doGardenJob() {
		System.out.println("mowing the lawn");
		
	}

}
