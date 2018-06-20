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
package concerttours.daos.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import concerttours.daos.BandDAO;
import concerttours.events.CommentEvent;
import concerttours.model.BandCommentModel;
import concerttours.model.BandModel;


@Component(value = "bandDAO")
public class DefaultBandDAO implements BandDAO
{
	@Autowired
	private ModelService modelService;

	@Resource
	private EventService eventService;
	/**
	 * Use Hybris FlexibleSearchService for running queries against the database
	 */
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	/**
	 * Finds all Bands by performing a FlexibleSearch using the {@link FlexibleSearchService}.
	 */
	@Override
	public List<BandModel> findBands(final String country)
	{
		// Build a query for the flexible search.
		//	country = "India";
		/*
		 * if (country != null && !country.isEmpty()) { final String queryString = // "SELECT {p:" + BandModel.PK + "} "// +
		 * "FROM {" + BandModel._TYPECODE + " AS p} " + "WHERE " + "{p:" + BandModel.COUNTRY + "} like 'Germany' "; final
		 * FlexibleSearchQuery query = new FlexibleSearchQuery(queryString); return flexibleSearchService.<BandModel>
		 * search(query).getResult(); } else {
		 */
		//JOptionPane.showMessageDialog(null, country);
		final String queryString = //
				"SELECT {p:" + BandModel.PK + "}"//
						+ "FROM {" + BandModel._TYPECODE + " AS p}" //
						+ "WHERE " + "{p:" + BandModel.COUNTRY + "}=?country";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		//JOptionPane.showMessageDialog(null, query);
		query.addQueryParameter("country", country);//for dynamic value passed at the time of runtime
				return flexibleSearchService.<BandModel> search(query).getResult();
	}

	/*
	 * final Map<String, Object> params = new HashMap<String, Object>(); final String query
	 * ="SELECT {p:pk} FROM {Band AS p} WHERE {p:country} LIKE ?country"; params.put("code","001"); final
	 * SearchResult<BandModel> searchResult = flexibleSearchService.search(query, params);
	 */
		// Return the list of BandModels.
		//return flexibleSearchService.<BandModel> search(query).getResult();
	/*
	 * return (List<BandModel>) searchResult; }
	 */
	/**
	 * Finds all Bands by given code by performing a FlexibleSearch using the {@link FlexibleSearchService}.
	 */
	@Override
	public List<BandModel> findBandsByCode(final String code)
	{
		final String queryString = //
		"SELECT {p:" + BandModel.PK + "}" //
				+ "FROM {" + BandModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + BandModel.CODE + "}=?code";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<BandModel> search(query).getResult();
	}

	@Override
	public int saveComm(final BandCommentModel bandCommentModel)
	{
		/*
		 * final String queryString =
		 * "INSERT_UPDATE BandComments;code[unique=true];date[dateformat=dd.MM.yyyy HH:mm:ss];name;comment" + ";" +
		 * bandCommentModel.getCode() + ";" + bandCommentModel.getDate() + ";" + bandCommentModel.getName() + ";" +
		 * bandCommentModel.getComment(); final InsertRecord insertRecord = new InsertRecord(bandCommentModel.getPk(),
		 * queryString, ); if (insertRecord.equals(null)) { return 0; } else { return 1; }
		 */
		final BandCommentModel obj = modelService.create(BandCommentModel.class);

		if (obj.equals(null))
		{
			return 0;
		}
		else
		{
			obj.setCode(bandCommentModel.getCode());
			obj.setDate(bandCommentModel.getDate());
			obj.setName(bandCommentModel.getName());
			obj.setComment(bandCommentModel.getComment());
			obj.setOwner(bandCommentModel.getOwner());
			obj.setBands(bandCommentModel.getBands());

			modelService.save(obj);
			//calling event when comment is saved by creating instance of CommentEvent class
			final CommentEvent commentEvent = new CommentEvent("Comment added successfully");
			//publish the event
			eventService.publishEvent(commentEvent);
			return 1;
		}

	}

	@Override
	public List<BandCommentModel> findCommentsByCode(final String code)
	{
		final String queryString = //
				"SELECT {p:" + BandCommentModel.PK + "}" //
						+ "FROM {" + BandCommentModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + BandCommentModel.CODE + "}=?code " + "ORDER BY " + "{p:" + BandCommentModel.DATE
						+ "} DESC ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<BandCommentModel> search(query).getResult();
	}
}