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
package concerttours.out;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import concerttours.daos.BandDAO;
import concerttours.model.BandModel;


/**
 *
 */
public class CreateExcelFile
{
	int rownum = 0;
	HSSFSheet firstSheet;
	Collection<File> files;
	HSSFWorkbook workbook;

	private static BandDAO bandDAO;

	File exactFile;
	{
		workbook = new HSSFWorkbook();
		firstSheet = workbook.createSheet("FIRST SHEET");
		final HSSFRow headerRow = firstSheet.createRow(rownum);
		headerRow.setHeightInPoints(40);
	}

	public void generateFile() throws Exception
	{
		final List<BandModel> bands = bandDAO.findBands();
		final List<String> headerRow = new ArrayList<String>();
		headerRow.add("BandName");
		final List<List> recordToAdd = new ArrayList<List>();
		recordToAdd.add(headerRow);
		final List<String> firstRow = new ArrayList<String>();
		for (final Object list : bands)
		{
			firstRow.add(list.toString());
			recordToAdd.add(firstRow);
		}

		final CreateExcelFile cls = new CreateExcelFile(recordToAdd);
		cls.createExcelFile();
	}

	void createExcelFile()
	{
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream(new File("ExcelSheet.xls"));
			final HSSFCellStyle hsfstyle = workbook.createCellStyle();
			hsfstyle.setBorderBottom((short) 1);
			hsfstyle.setFillBackgroundColor((short) 245);
			workbook.write(fos);
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
	}

	public CreateExcelFile(final List<List> l1) throws Exception
	{
	    try {
	      for (int j = 0; j < l1.size(); j++) {
	        final HSSFRow row = firstSheet.createRow(rownum);
	        final List<String> l2= l1.get(j);
	        for(int k=0; k<l2.size(); k++)
	        {
	          final Cell cell = row.createCell(k);
	          cell.setCellValue(l2.get(k));
	        }
	        rownum++;
	      }
	    } catch (final Exception e) {
	      e.printStackTrace();
	    } finally {
			//
	    }
	  }

	public CreateExcelFile()
	{
		//do nothing
	}
}