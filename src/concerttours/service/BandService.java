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
package concerttours.service;

import java.util.List;

import concerttours.model.BandCommentModel;
import concerttours.model.BandModel;


public interface BandService
{
	/**
	 * Gets all bands in the system.
	 *
	 * @return all bands in the system
	 */
	List<BandModel> getBands(String country);

	/**
	 * Gets the band for the given code.
	 *
	 * @throws de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException
	 *            in case more then one band is found for the given code
	 * @throws de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException
	 *            in case no band for the given code can be found
	 */
	BandModel getBandForCode(String code);

	/**
	 * to store comment i db
	 */
	int save(BandCommentModel bandCommentModel);

	//to fetch comment from dao

	List<BandCommentModel> getCommentForCode(String code);

}
