
// [y] hybris Platform

/* Copyright (c) 2000-2018 SAP SE All rights reserved.

 This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall
 not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 agreement you entered into with SAP Hybris.*/

package concerttours.bands;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import concerttours.data.CommentData;
import concerttours.facades.BandFacade;
import concerttours.jalo.BandComment;
import concerttours.model.BandCommentModel;


@IntegrationTest
public class BandCommentTest extends ServicelayerTransactionalTest
{
	//This will load modelService resources

	@Resource
	//@Autowired
	private ModelService modelService;

	//This will load bandCommentModel
	//@Resource
	@Autowired
	private BandCommentModel bandCommentModel;

	//This will load bandDAO service

	@Resource
	//@Autowired
	private BandFacade bandFacade;

	private static final Logger LOG = Logger.getLogger(BandComment.class);

	private static final String BAND_CODE = "A006";


	//@Test annotation will tell hybris to start testing from here

	@Test
	//create bandCommentModel test
	public void save_record_test()
	{

		final BandCommentModel bandCommentModel = modelService.create(BandCommentModel.class); //setting the values
		bandCommentModel.setCode(BAND_CODE);
		bandCommentModel.setDate(new Date());

		//save bandCommentModel to the database
		modelService.save(bandCommentModel);

		//assert that bandCommentModel is saved
		final BandComment bandComment = modelService.getSource(bandCommentModel);
		final BandCommentModel savedBandCommentModel = modelService.get(bandComment);

		Assert.assertNotNull(savedBandCommentModel.getPk());

	}

	@Test
	public void fetchedData()
	{

		//fetching data from the database
		LOG.info("We are in fetchedData method");
		LOG.info(BAND_CODE);
		final List<CommentData> commentData = bandFacade.getCommentForCode(BAND_CODE);
		LOG.info(commentData);
		if (!commentData.isEmpty())
		{
			Assert.assertNotNull("Records found in databases", bandCommentModel);
		}
		else
		{
			Assert.assertNull("NO records in database", bandCommentModel);
		}
	}

}
