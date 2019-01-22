package springcleaners.tools.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import springcleaners.tools.interfaces.CleaningTool;

@Component
@Order(3)
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
