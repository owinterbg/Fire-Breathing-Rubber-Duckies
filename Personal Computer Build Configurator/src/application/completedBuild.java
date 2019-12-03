package application;
import java.util.ArrayList;

public class completedBuild {
	private ArrayList<Inventory> completed;
	private full_build inventory;
	private double totalPrice;
	
	public completedBuild(full_build inventory) {
		this.completed = new ArrayList<Inventory>();
		this.inventory = inventory;
		totalPrice = 0.0;
		
	}
	public ArrayList<Inventory> getCompleted() {
		return completed;
	}

	public void setCompleted(ArrayList<Inventory> completed) {
		this.completed = completed;
	}

	public full_build getBuild() {
		return inventory;
	}

	public void setBuild(full_build build) {
		this.inventory = build;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice() {
		double totalPrice = 0;
		for(Inventory part: this.completed)
		{
			totalPrice += part.getPrice();
		}
		this.totalPrice = totalPrice;
		
	}
	public ArrayList<Inventory> getCompleteBuild(int quality, String type) {
		for(Inventory part: this.inventory.getInventoryList())
		{
			if(part.getBuildType().equals(type) && (part.getQuality().equals(""+quality)))
				this.completed.add(part);
		}
		return this.completed;
	}
	
}