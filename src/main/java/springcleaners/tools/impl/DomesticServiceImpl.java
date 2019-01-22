package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import events.LunchEvent;
import springcleaners.services.interfaces.CleaningService;
import springcleaners.services.interfaces.DomesticService;
import springcleaners.services.interfaces.GardeningService;

@Component

public class DomesticServiceImpl implements DomesticService {

	CleaningService CleaningService;

	@Autowired
	GardeningService GardingService;

	@Autowired
	public void setCleaningService(CleaningServiceImpl cleaningService) {
		CleaningService = cleaningService;

	}

	public void setGardingService(GardeningServiceImpl gardingService) {
		GardingService = gardingService;
	}

	@Override

	public void runHouseHold() {
		CleaningService.clean();
		GardingService.garden();

	}

	public void init() {
		System.out.println("DomesticService preparing for work.");

	}

	public void destroy() {
		System.out.println("DomesticService cleaning up.");
	}
	
	@EventListener
	@Order(1)
	public void onlunchEvent(LunchEvent e) {
	
		int time = e.getTime();
		System.out.println("Taking a break for lunch and you have "+ time + " minutes");
	}

}
