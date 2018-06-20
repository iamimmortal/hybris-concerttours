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

/*this will hold data passed to event listener*/
package concerttours.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 *
 */
public class CommentEvent extends AbstractEvent
{
	private final String success;

	public CommentEvent(final String success)
	{
		this.success = success;
	}

	public String getMessage()
	{
		return success;
	}
}
