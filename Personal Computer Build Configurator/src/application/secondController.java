package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class secondController /*implements Initializable*/{
	
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
	
	public double budget;
	
	public int num = 1;
	
	
	public void changeToFirstScene(ActionEvent event) throws IOException
	{
		Parent secondSceneParent = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Scene secondScene = new Scene(secondSceneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(secondScene);
		window.show();
	}
	
	
	@FXML
	public void initialize() throws IOException {
		
		
		System.out.println("In the init: Budget: "+budget+" \n and the num");
		


	}
	
	
		
	public void getBudget(String userBudgetGlobal) {
		System.out.println("This happened now------------");
		this.budget = Double.parseDouble(userBudgetGlobal);
		System.out.println("input: "+ userBudgetGlobal+ "\n Budget: "+ budget+ "\n"+ num);
		
		
	}
	
	@FXML
	public void displayInformation(ActionEvent event)
	{
		System.out.println("INMETHODBudget: "+ budget+"\nDisplayed: "+ num);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

}
