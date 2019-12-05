package application;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class secondController {
	//these are all text areas for the TextAreas
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
	
	public static double budget; //global budget variable
	
	public static String build_type; //global build type 
	
	
	
	/*
	 * public String getBuild_type()
	 * returns build type
	 * Return:
	 * 	String build_type
	 */
	public String getBuild_type() {
		return build_type;
	}
	
	/*
	 * public void setBuild_type(String build_type)
	 * sets the build type 
	 * Var In: 
	 * 	String build_type	type of PC build
	 * Return: 
	 * 	void 
	 */

	public void setBuild_type(String build_type) {
		secondController.build_type = build_type;
	}
	
	/*
	 * public double getBudget()
	 * returns budget
	 * Return:
	 * 	double budget 
	 */
	
	public double getBudget() {
		return budget;
	}
	
	/*
	 * public void setBudget(double budget)
	 * sets the budget
	 * Var In:
	 * 	double budget	number value for budget
	 * Return:
	 * 	void
	 */

	public void setBudget(double budget) {
		secondController.budget = budget;
	}
	
	/*
	 * 	public void changeToFirstScene(ActionEvent event) throws IOException
	 * changes from second scene back to first scene
	 * Var In:
	 * 	ActionEvent event	button fxml
	 * Return:
	 * 	void
	 */

	public void changeToFirstScene(ActionEvent event) throws IOException
	{
		Parent secondSceneParent = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Scene secondScene = new Scene(secondSceneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(secondScene);
		window.show();
	}

	@FXML
	public void initialize() throws IOException {} //initializing method
	
	/*
	 * 	public void displayInformation(ActionEvent event) throws IOException
	 *  linked to a button that displays information on the screen
	 *  Var In:
	 *  	ActionEvent event 	fxml button control
	 *  Return:
	 *  	void 
	 */
	
	@FXML
	public void displayInformation(ActionEvent event) throws IOException
	{	
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
		for(int i = 1; i <= 10; i++)
		{
			new_build = inventory.getFullBuild(i, "gaming");
			all_builds.add(new_build);
			
		}
		for(int i = 1; i <= 10; i++)
		{
			new_build = inventory.getFullBuild(i, "workstation");
			all_builds.add(new_build);
		}
		
		FullBuild final_build = new FullBuild(cpu, ram, graphics, case_, power, motherboard, ssd, hdd, "");
		for(FullBuild var: all_builds)
		{
			if(var.getTotal_price() <= this.getBudget() && this.getBuild_type().equalsIgnoreCase(var.getBuild_type()))
				final_build = var;
			if(var.getTotal_price() > this.getBudget() && this.getBuild_type().equalsIgnoreCase(var.getBuild_type()))
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
}
