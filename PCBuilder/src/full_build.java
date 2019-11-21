import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class full_build {
	private ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
	private int count = 0;
	
	public void read(String filename)
	{  
		
		File f = new File(filename);              // Construct a File.
	
		if (f.exists()) 
		{                           				   // Does it exist?
			if (f.isFile() && f.canRead()) {          // is it a File and can I read it?
			Scanner input = null;
            try {
            	input = new Scanner(f);               // The Scanner!
            	while (input.hasNext()) {
            		String contents = input.next();
            		String [] values = contents.split(",");
            		String quality = values[0];
            		String build = values[1];
            		String part = values[2];
            		String description = values[3];
            		String price = values[4];
            		
            		Inventory newInv = new Inventory(quality, build, part, description, price);
            		// Print the lines.
            		inventoryList.add(newInv);
            		setCount(getCount() + 1);
            		
            	}
            } catch (FileNotFoundException e) {
            	e.printStackTrace();
            }
            finally {
                input.close();
                  
            }
		}
      
	 }
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
