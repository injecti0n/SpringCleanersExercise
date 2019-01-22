package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

}
