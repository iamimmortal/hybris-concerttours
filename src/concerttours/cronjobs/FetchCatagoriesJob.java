/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2018 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package concerttours.cronjobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import concerttours.out.CreateExcelFile;


/**
 *
 */
public class FetchCatagoriesJob extends AbstractJobPerformable
{

	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		try {

			//generate excel
			final CreateExcelFile createExcelFile = new CreateExcelFile();
			createExcelFile.generateFile();
         // In case of success return result: SUCCESS and status: FINISHED
         return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

     } catch(final Exception e) {

         // In case of exception return result: ERROR and status: ABORTED
         return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);

     }


}
}
