package com.perigalrepeter.example.configbuilderfactory;

import com.perigalrepeter.example.model.Impl_WorkModel;
import com.soham.tools.cronjob.cron.CronJob;
import com.soham.tools.cronjob.main.AppConfigPoint;
import com.soham.tools.cronjob.model.AbstractWorkModel;
import com.soham.tools.cronjob.model.DTO_BusinessModel;

public class AppConfigBuilder {

	/**
	 * <ul>
	 * <li>
	 * STEP-1: Create object of an implementation of {@link AbstractWorkModel}
	 * </li>
	 * <li>
	 * STEP-2: Create object of and configure your {@link DTO_BusinessModel} 
	 * </li>
	 * <li>
	 * STEP-3:Pass arguments if any, else null; to the object of {@link DTO_BusinessModel}
	 * </li>
	 * <li>
	 * STEP-4: Call the setter CronJob.setAppConfigPoint(appConfigPoint); <b> without this , scheduler should not be started. Else, you would come across "ERROR-CODE:0x1001  \n AppConfigPoint is not set! "
	 * </li>
	 * 
	 * </ul>
	 */
	public static AppConfigPoint buildAppConfigPoint() {

		AbstractWorkModel workModel = new Impl_WorkModel();

		DTO_BusinessModel businessModel = new DTO_BusinessModel(workModel);
		businessModel.setObjArr(null);
		final AppConfigPoint appConfigPoint = new AppConfigPoint(businessModel);
		
		appConfigPoint.setTriggerExpression("0/5 * * * * ?"); // Setting CRON Expression- execute every 5 second 

		CronJob.setAppConfigPoint(appConfigPoint);
		return appConfigPoint;
	}
}
