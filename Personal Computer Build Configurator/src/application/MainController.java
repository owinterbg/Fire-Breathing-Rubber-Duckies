package application;

import java.io.IOException;
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
	private ComboBox<String> comboBox1 = new ComboBox<String>(); //combo box for first selection
	@FXML
	private ComboBox<String> comboBox2 = new ComboBox<String>(); // combo box for second selection
	@FXML
	private ComboBox<String> comboBox3 = new ComboBox<String>(); // combo box for third selection
	@FXML
	private TextField userInput; // user imput for budget
	
	public String userBudgetGlobal; //global variable for budget

	
	/*
	 * public void initialize()
	 * Initializes the combo boxes in the main scene
	 * Return:
	 * 	void
	 */
	
	
	@FXML
	public void initialize() {
	 	comboBox1.getItems().addAll("Gaming", "Workstation");
	 	comboBox2.getItems().addAll("CPU", "RAM", "Graphics Card", "Tower Case", "Power Supply", "Motherboard", "SSD", "HDD");
	 	comboBox3.getItems().addAll("CPU", "RAM", "Graphics Card", "Tower Case", "Power Supply", "Motherboard", "SSD", "HDD");

	}
	
	/*
	 * public void handle(ActionEvent handle) throws IOException
	 * Handle button for saving results from user and passing budget 
	 * Var In:
	 * 	ActionEvent handle	fxml button handle
	 * Return:
	 * 	void
	 */

	
	public void handle(ActionEvent handle) throws IOException
	{
		String answerBox1 = comboBox1.getValue();
		String answerBox2 = comboBox2.getValue();
		String answerBox3 = comboBox3.getValue();
		String userBudget = userInput.getText();
		double userBudgetNum = Integer.parseInt(userBudget);
		userBudgetGlobal = userBudget;
		String build_type = answerBox1;
		
		
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(getClass().getResource("secondScene.fxml"));
		Loader.load();
		secondController secCont = Loader.getController();
		
		secCont.setBudget(userBudgetNum);
		secCont.setBuild_type(build_type);
	}
	
	/*
	 * 	public void changeToSecondScene(ActionEvent event) throws IOException
	 * changes the scene 
	 * Var In: 
	 * 	ActionEvent event	fxml event button
	 * Return:
	 * 	void
	 */
	
	public void changeToSecondScene(ActionEvent event) throws IOException
	{
		Parent secondSceneParent = FXMLLoader.load(getClass().getResource("secondScene.fxml"));
		
		Scene secondScene = new Scene(secondSceneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(secondScene);
		window.show();
	
	}
	
	//not used
	
	public double sendBudget()
	{
		return Double.parseDouble(userBudgetGlobal);
	}
	
}
