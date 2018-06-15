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
package integrationTest;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;

import java.util.List;

import org.junit.Test;

import concerttours.daos.BandDAO;
import concerttours.model.BandCommentModel;


/**
 *
 */
@IntegrationTest
public class BandCommentTest extends ServicelayerTransactionalTest
{
	private BandCommentModel bandCommentModel;
	private BandDAO bandDao;

	@Test
	public List<BandCommentModel> bandComment = bandDao.findCommentsByCode("A001")
	{
		
	}
}
