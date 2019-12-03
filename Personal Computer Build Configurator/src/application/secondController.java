package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class secondController {
	
	//"CPU", "RAM", "Graphics Card", "Tower Case", "Power Supply", "Motherboard", "SSD", "HDD"
	@FXML
	private TextArea CPUOut;
	@FXML
	private TextArea RAMOut;
	@FXML
	private TextArea graphicsCardOut;
	@FXML
	private TextArea towerCaseOut;
	@FXML
	private TextArea powerSupplyOut;
	@FXML
	private TextArea motherboardOut;
	@FXML
	private TextArea SSDOut;
	@FXML
	private TextArea HDDOut;
	
	
	public void changeToFirstScene(ActionEvent event) throws IOException
	{
		Parent secondSceneParent = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Scene secondScene = new Scene(secondSceneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(secondScene);
		window.show();
	}
	
	@FXML
	public void initialize() {
	 	


	}
	
	
	public void displayInformation(ActionEvent event)
	{
		
	}
	

}
