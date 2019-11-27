package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class MainController {
	
	@FXML	
	private ComboBox<String> comboBox1 = new ComboBox<String>();
	@FXML
	private ComboBox<String> comboBox2 = new ComboBox<String>();
	@FXML
	private ComboBox<String> comboBox3 = new ComboBox<String>();
	
	@FXML
	public void initialize() {
	 	comboBox1.getItems().addAll("High", "Medium", "Low");
	 	comboBox2.getItems().addAll("High", "Medium", "Low");
	 	comboBox3.getItems().addAll("High", "Medium", "Low");

	}

	
	public void handle(ActionEvent handle) throws IOException
	{
		String answerBox1 = comboBox1.getValue();
		String answerBox2 = comboBox2.getValue();
		String answerBox3 = comboBox3.getValue();
		
		System.out.println(answerBox1 + "\n" + answerBox2 + "\n" + answerBox3);
		
	}
	
	public void changeToSecondScene(ActionEvent event) throws IOException
	{
		Parent secondSceneParent = FXMLLoader.load(getClass().getResource("secondScene.fxml"));
		
		Scene secondScene = new Scene(secondSceneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(secondScene);
		window.show();
	}

}
