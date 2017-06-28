package pl.dinem.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import pl.dinem.main.Listing;

public class MenuController {

	private MainWindowController mainWindowController;

	@FXML
	TextField textLabel;

	@FXML
	public void onListFiles() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/FilesScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FilesScreenController filesScreenController = loader.getController();
		filesScreenController.setMainWindowController(mainWindowController);
		filesScreenController.setListing(new Listing(textLabel.getText()));
		mainWindowController.stackPane.getChildren().add(pane);
	}

	String pwd = System.getProperty("user.dir");	//working directory

	public void setMainWindowController(MainWindowController mainWindowController) {
		this.mainWindowController = mainWindowController;
	}

	@FXML
	void initialize() {
		textLabel.setText(pwd);
	}
}
