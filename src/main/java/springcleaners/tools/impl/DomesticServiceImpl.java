package springcleaners.tools.impl;

import springcleaners.services.interfaces.CleaningService;
import springcleaners.services.interfaces.DomesticService;
import springcleaners.services.interfaces.GardeningService;

public class DomesticServiceImpl implements DomesticService {

	CleaningService CleaningService;
	GardeningService GardingService;

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
