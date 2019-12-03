package application;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class full_build {
	private ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
	
	private int count;
	public full_build()
	{
		setCount(0);
	}
	
	public void readFile(String fileIn) throws IOException
	{
		String fileName = fileIn;
		File f = new File(fileName);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while ((line = br.readLine()) != null)
		{
			String goodline = line;
			String [] words = goodline.split(",");
			String price = words[4].replaceAll("[$+]", "");
			double newPrice = Double.valueOf(price);
			Inventory newInv = new Inventory(words[0], words[1], words[2], words[3], newPrice);
			count+=1;
			inventoryList.add(newInv);
			
			
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public ArrayList<Inventory> getInventoryList() {
		return inventoryList;
	}

	public void setInventoryList(ArrayList<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}




}
