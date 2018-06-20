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
package interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import javax.swing.JOptionPane;

import concerttours.model.BandCommentModel;


/**
 *
 */
public class CommentEntryValidation implements ValidateInterceptor
{
	@Override

	public void onValidate(final Object bandComment, final InterceptorContext ctx) throws InterceptorException
	{
		if (bandComment instanceof BandCommentModel)
		{
			final BandCommentModel bandCommentModel = (BandCommentModel) bandComment;
			if (bandCommentModel.getCode() == null)
			{

				JOptionPane.showMessageDialog(null, "Interceptor is working properly and data is not persisted");
				throw new InterceptorException("Interceptor is working properly and data is not persisted");

			}
		}
	}
}
