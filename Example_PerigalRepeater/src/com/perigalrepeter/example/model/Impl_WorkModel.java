package com.perigalrepeter.example.model;

import java.util.Date;

import com.soham.tools.cronjob.model.AbstractWorkModel;

/**
 * @author ssengup1
 * Sub-class com.soham.tools.cronjob.model.AbstractWorkModel
 *
 */
public class Impl_WorkModel extends AbstractWorkModel {

	/* (non-Javadoc)
	 * @see com.soham.tools.cronjob.model.AbstractWorkModel#repeatJobOnLinux(java.lang.Object[])
	 */
	@Override
	public Object repeatJobOnLinux(Object[] arg0) {
		
		String x="From linux "+new Date();
		System.out.println("Impl_WorkModel.repeatJobOnLinux()"+x);
		return x;
	}

	/* (non-Javadoc)
	 * @see com.soham.tools.cronjob.model.AbstractWorkModel#repeatJobOnWindows(java.lang.Object[])
	 */
	@Override
	public Object repeatJobOnWindows(Object... arg0) {
		
		String x="From Windows "+new Date();
		System.out.println("Impl_WorkModel.repeatJobOnWindows()"+x);
		return x;
	}

}
