package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Autowired;

import springcleaners.services.interfaces.DomesticService;

public class DomesticServiceImpl implements DomesticService {

	CleaningServiceImpl CleaningService;
	GardeningServiceImpl GardingService;

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
