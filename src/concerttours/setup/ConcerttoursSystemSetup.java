/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package concerttours.setup;

import static concerttours.constants.ConcerttoursConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import concerttours.constants.ConcerttoursConstants;
import concerttours.service.ConcerttoursService;


@SystemSetup(extension = ConcerttoursConstants.EXTENSIONNAME)
public class ConcerttoursSystemSetup
{
	private final ConcerttoursService concerttoursService;

	public ConcerttoursSystemSetup(final ConcerttoursService concerttoursService)
	{
		this.concerttoursService = concerttoursService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		concerttoursService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ConcerttoursSystemSetup.class.getResourceAsStream("/concerttours/sap-hybris-platform.png");
	}
}
