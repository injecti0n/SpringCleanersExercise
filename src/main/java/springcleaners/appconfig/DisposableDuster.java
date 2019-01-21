package springcleaners.appconfig;

import springcleaners.tools.interfaces.CleaningTool;

public class DisposableDuster implements CleaningTool {
	private boolean used = false;
	@Override
	public void doCleanJob() {
		if(used) {
			System.out.println("Used");
		}else {
			System.out.println("throw it");
			used = true;
		}

	}

}
