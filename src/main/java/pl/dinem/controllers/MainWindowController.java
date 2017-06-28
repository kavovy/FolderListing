package pl.dinem.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainWindowController {
	@FXML
	StackPane stackPane;

	@FXML
	void initialize() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuController menuController = loader.getController();
		menuController.setMainWindowController(this);
		
		setScreen(pane);

	}

	public void setScreen(Pane pane) {
		stackPane.getChildren().clear();
		stackPane.getChildren().add(pane);
	}

}
