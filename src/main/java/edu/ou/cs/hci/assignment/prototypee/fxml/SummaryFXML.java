//******************************************************************************
// Copyright (C) 2020 University of Oklahoma Board of Trustees.
//******************************************************************************
// Last modified: Mon Apr 13 00:31:12 2020 by Chris Weaver
//******************************************************************************
// Major Modification History:
//
// 20200412 [weaver]:	Original file.
//
//******************************************************************************
//
//******************************************************************************

package edu.ou.cs.hci.assignment.prototypee.fxml;

//import java.lang.*;
import java.io.IOException;
import javafx.fxml.*;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

//******************************************************************************

public class SummaryFXML extends BorderPane
{
	//**********************************************************************
	// Private Members
	//**********************************************************************

	// Add members for each of the widgets loaded from FXML for
	// use in the summary area of the CollectionPane. The names must match both
	// the summary widgets in CollectionPane.java and the fx:ids in Summary.fxml
	@FXML public Label			summaryTitle;
	@FXML public ImageView summaryImage;
	@FXML public Label summaryYear, summaryGenre, summaryRating, summaryRuntime;

	//**********************************************************************
	// Constructors and Finalizer
	//**********************************************************************

	public SummaryFXML()
	{
		FXMLLoader	fxmlLoader =
			new FXMLLoader(getClass().getResource("Summary.fxml"));

		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try
		{
			fxmlLoader.load();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}

//******************************************************************************
