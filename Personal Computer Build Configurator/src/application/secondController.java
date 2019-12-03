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
	@FXML
	private TextArea TotalPrice;
	
	//public double budget;
	
	
	
	
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
		
		
		//System.out.println("In the init: Budget: "+budget+" \n and the num");
		


	}
	
	
		
	public void getBudget(String userBudgetGlobal) {
		System.out.println("This happened now------------");
		this.budget = Double.parseDouble(userBudgetGlobal);
		System.out.println("input: "+ userBudgetGlobal+ "\n Budget: "+ budget+ "\n");
		
		
	}
	
	@FXML
	public void displayInformation(ActionEvent event) throws IOException
	{
		double budget = 1500;
		String build_type = "gaming";
		//System.out.println("INMETHODBudget: "+ budget+"\nDisplayed: "+ num);
		
		Inventory inventory = new Inventory();
		inventory.readFile("data/data.csv");
		
		ArrayList<FullBuild> all_builds = new ArrayList<FullBuild>();
		
		CPU cpu = new CPU(0, "", "", 0);
		RAM ram = new RAM(0, "", "", 0);
		GraphicsCard graphics = new GraphicsCard(0, "", "", 0);
		Case case_  = new Case(0, "", "", 0);
		PowerSupply power = new PowerSupply(0, "", "", 0);
		Motherboard motherboard = new Motherboard(0, "", "", 0);
		SSD ssd = new SSD(0, "", "", 0);
		HDD	hdd = new HDD(0, "", "", 0);
		
		FullBuild new_build = new FullBuild(cpu, ram, graphics, case_, power, motherboard, ssd, hdd, "");
		for(int i = 1; i <= 3; i++)
		{
			new_build = inventory.getFullBuild(i, "gaming");
			all_builds.add(new_build);
			
		}
		for(int i = 1; i <= 3; i++)
		{
			new_build = inventory.getFullBuild(i, "workstation");
			all_builds.add(new_build);
		}
		
		FullBuild final_build = new FullBuild(cpu, ram, graphics, case_, power, motherboard, ssd, hdd, "");
		for(FullBuild var: all_builds)
		{
			if(var.getTotal_price() <= budget && build_type.equalsIgnoreCase(var.getBuild_type()))
				final_build = var;
			else
				break;
		}
		CPUOut.setText(final_build.getCpu().toString());
		RAMOut.setText(final_build.getRam().toString());
		graphicsCardOut.setText(final_build.getGraphics().toString());
		towerCaseOut.setText(final_build.getCase_().toString());
		powerSupplyOut.setText(final_build.getPower().toString());
		motherboardOut.setText(final_build.getMotherboard().toString());
		SSDOut.setText(final_build.getSsd().toString());
		HDDOut.setText(final_build.getHdd().toString());
		TotalPrice.setText("$" + final_build.getTotal_price());

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

}
