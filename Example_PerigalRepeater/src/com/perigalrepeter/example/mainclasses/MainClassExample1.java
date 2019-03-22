package com.perigalrepeter.example.mainclasses;

import org.quartz.SchedulerException;

import com.perigalrepeter.example.configbuilderfactory.AppConfigBuilder;
import com.soham.tools.cronjob.main.AppConfigPoint;

/**
 * @author ssengup1 The simplest demo of using Perigal Repeater
 */
public class MainClassExample1 {

	/**
	 * @param args
	 * @throws SchedulerException
	 * 
	 */
	public static void main(String[] args) throws SchedulerException {

		/***
		 * STEP-1: Get object of an com.soham.tools.cronjob.main.AppConfigPoint
		 */
		AppConfigPoint appConfigPoint = AppConfigBuilder.buildAppConfigPoint();

		/**
		 * STEP-2: Call com.soham.tools.cronjob.main.AppConfigPoint.scheduleService()
		 */
		appConfigPoint.scheduleService();

		/***
		 * NOTE: Inside
		 * com.perigalrepeter.example.configbuilderfactory.AppConfigBuilder.buildAppConfigPoint()
		 * ,
		 * 
		 * call to CronJob.setAppConfigPoint(appConfigPoint) has already been made
		 */
	}

}
