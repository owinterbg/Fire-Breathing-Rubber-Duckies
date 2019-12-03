package application;

import java.io.IOException;
import java.util.logging.Logger;

import com.sun.glass.ui.Window.Level;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController {
	
	@FXML	
	private ComboBox<String> comboBox1 = new ComboBox<String>();
	@FXML
	private ComboBox<String> comboBox2 = new ComboBox<String>();
	@FXML
	private ComboBox<String> comboBox3 = new ComboBox<String>();
	@FXML
	private TextField userInput;
	
	public String userBudgetGlobal;

	
	@FXML
	public void initialize() {
	 	comboBox1.getItems().addAll("Gaming", "Work");
	 	comboBox2.getItems().addAll("CPU", "RAM", "Graphics Card", "Tower Case", "Power Supply", "Motherboard", "SSD", "HDD");
	 	comboBox3.getItems().addAll("CPU", "RAM", "Graphics Card", "Tower Case", "Power Supply", "Motherboard", "SSD", "HDD");

	}

	
	public void handle(ActionEvent handle) throws IOException
	{
		String answerBox1 = comboBox1.getValue();
		String answerBox2 = comboBox2.getValue();
		String answerBox3 = comboBox3.getValue();
		String userBudget = userInput.getText();
		double userBudgetNum = Integer.parseInt(userBudget);
		userBudgetGlobal = userBudget;
		
		
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(getClass().getResource("secondScene.fxml"));
		Loader.load();
		secondController secCont = Loader.getController();
		
		secCont.setBudget(userBudgetNum);
		
		System.out.println(answerBox1 + "\n" + answerBox2 + "\n" + answerBox3 + userBudgetGlobal+ "\n");
		
	}
	
	public void changeToSecondScene(ActionEvent event) throws IOException
	{
		Parent secondSceneParent = FXMLLoader.load(getClass().getResource("secondScene.fxml"));
		
		Scene secondScene = new Scene(secondSceneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(secondScene);
		window.show();
		
		
		
	
	}
	
	public double sendBudget()
	{
		return Double.parseDouble(userBudgetGlobal);
	}
	
}
