package pl.dinem.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pl.dinem.main.Listing;

public class FilesScreenController {

	MainWindowController mainWindowController;

	private Listing listing;

	@FXML
	private ListView<String> listView;

	public void setListing(Listing listing) {
		this.listing = listing;
	}

	public void setMainWindowController(MainWindowController mainWindowController) {
		this.mainWindowController = mainWindowController;
	}

	//private ObservableList<String> filesForList;
	// FXCollections.observableArrayList(listing.getFiles()); //this is crashing grrr

	@FXML
	void initialize() {
		//System.out.println(listing.getFiles());
		//filesForList = FXCollections.observableArrayList(listing.getFiles());
		//listView.getItems().addAll(filesForList);

	}
}