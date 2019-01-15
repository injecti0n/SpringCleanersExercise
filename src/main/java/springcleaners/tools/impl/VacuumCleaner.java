package springcleaners.tools.impl;

import springcleaners.tools.interfaces.CleaningTool;

public class VacuumCleaner implements CleaningTool{

	public void doCleanJob() {
		System.out.println("Vacuuuum cleaner is suckin the dust");
		
	}

}
