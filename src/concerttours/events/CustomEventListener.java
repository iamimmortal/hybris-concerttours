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

/*This will listen to the event and passed the message written in event class*/
package concerttours.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import javax.swing.JOptionPane;


/**
 *
 */
public class CustomEventListener extends AbstractEventListener<CommentEvent>
{

	@Override
	protected void onEvent(final CommentEvent commentEvent)
	{

		JOptionPane.showMessageDialog(null, commentEvent.getMessage());
	}

}
