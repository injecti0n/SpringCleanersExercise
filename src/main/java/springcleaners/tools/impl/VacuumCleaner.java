package springcleaners.tools.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import springcleaners.tools.interfaces.CleaningTool;

@Component
@Order(2)
@Scope("prototype")
@Qualifier("vacuum")
public class VacuumCleaner implements CleaningTool{

	public void doCleanJob() {
		System.out.println("Vacuuuum cleaner is suckin the dust");
		
	}

}
