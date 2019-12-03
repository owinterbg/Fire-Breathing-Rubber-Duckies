import java.io.*;
import java.util.*;


public class Inventory {
	private ArrayList<CPU> cpu;
	private ArrayList<RAM> ram;
	private ArrayList<GraphicsCard> graphics;
	private ArrayList<Case> case_;
	private ArrayList<PowerSupply> power;
	private ArrayList<Motherboard> motherboard;
	private ArrayList<SSD> ssd;
	private ArrayList<HDD>	hdd;
	
	//getters and setters
	public ArrayList<CPU> getCpu() {
		return cpu;
	}
	public void setCpu(ArrayList<CPU> cpu) {
		this.cpu = cpu;
	}
	public ArrayList<RAM> getRam() {
		return ram;
	}
	public void setRam(ArrayList<RAM> ram) {
		this.ram = ram;
	}
	public ArrayList<GraphicsCard> getGraphics() {
		return graphics;
	}
	public void setGraphics(ArrayList<GraphicsCard> graphics) {
		this.graphics = graphics;
	}
	public ArrayList<Case> getCase_() {
		return case_;
	}
	public void setCase_(ArrayList<Case> case_) {
		this.case_ = case_;
	}
	public ArrayList<PowerSupply> getPower() {
		return power;
	}
	public void setPower(ArrayList<PowerSupply> power) {
		this.power = power;
	}
	public ArrayList<Motherboard> getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(ArrayList<Motherboard> motherboard) {
		this.motherboard = motherboard;
	}
	public ArrayList<SSD> getSsd() {
		return ssd;
	}
	public void setSsd(ArrayList<SSD> ssd) {
		this.ssd = ssd;
	}
	public ArrayList<HDD> getHdd() {
		return hdd;
	}
	public void setHdd(ArrayList<HDD> hdd) {
		this.hdd = hdd;
	}
	
	public Inventory()
	{
		this.cpu = new ArrayList<CPU>();
		this.ram = new ArrayList<RAM>();
		this.graphics = new ArrayList<GraphicsCard>();
		this.case_ = new ArrayList<Case>();
		this.power = new ArrayList<PowerSupply>();
		this.motherboard = new ArrayList<Motherboard>();
		this.ssd = new ArrayList<SSD>();
		this.hdd = new ArrayList<HDD>();
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
			
			int quality = Integer.parseInt(words[0]);
			
			String build_type = words[1];
			
			String part_type = words[2];
			
			String discription = words[3];
			
			String price = words[4].replaceAll("[$+]", "");
			double newPrice = Double.valueOf(price);
			
			switch(part_type) {
			case "RAM":
				RAM ram = new RAM(quality, build_type, discription, newPrice);
				this.ram.add(ram);
				
			case "CPU":
				CPU cpu = new CPU(quality, build_type, discription, newPrice);
				this.cpu.add(cpu);
				
			case "Graphics Card":
				GraphicsCard graphics = new GraphicsCard(quality, build_type, discription, newPrice);
				this.graphics.add(graphics);
				
			case "Power Supply":
				PowerSupply power = new PowerSupply(quality, build_type, discription, newPrice);
				this.power.add(power);
				
			case "Case":
				Case case_ = new Case(quality, build_type, discription, newPrice);
				this.case_.add(case_);
				
			case "Motherboard":
				Motherboard motherboard = new Motherboard(quality, build_type, discription, newPrice);
				this.motherboard.add(motherboard);
				
			case "SSD":
				SSD ssd = new SSD(quality, build_type, discription, newPrice);
				this.ssd.add(ssd);
				
			case "HDD":
				HDD hdd = new HDD(quality, build_type, discription, newPrice);
				this.hdd.add(hdd);
			}
		}
		
		fr.close();
		br.close();
		
	}
	public FullBuild getFullBuild(int quality, String build_type) {
		CPU cpu = new CPU(0, "", "", 0);
		RAM ram = new RAM(0, "", "", 0);
		GraphicsCard graphics = new GraphicsCard(0, "", "", 0);
		Case case_  = new Case(0, "", "", 0);
		PowerSupply power = new PowerSupply(0, "", "", 0);
		Motherboard motherboard = new Motherboard(0, "", "", 0);
		SSD ssd = new SSD(0, "", "", 0);
		HDD	hdd = new HDD(0, "", "", 0);
		
		for(CPU var: this.cpu)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				cpu = var;
		}
		for(RAM var: this.ram)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				ram = var;
		}
		for(GraphicsCard var: this.graphics)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				graphics = var;
		}
		for(Case var: this.case_)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				case_ = var;
		}
		for(PowerSupply var: this.power)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				power = var;
		}
		for(Motherboard var: this.motherboard)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				motherboard = var;
		}
		for(SSD var: this.ssd)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				ssd = var;
		}
		for(HDD var: this.hdd)
		{
			if(var.getBuild_type().equalsIgnoreCase(build_type) && quality == var.getQuality())
				hdd = var;
		}
		
		FullBuild return_build = new FullBuild(cpu, ram, graphics, case_, power, motherboard, ssd, hdd);
		
		return return_build;
	}
	
	public String toString() {
		String return_this = "Inventory:\n\tCPUS:\t";
		for(CPU var: this.cpu)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tRAMs:\t";
		for(RAM var: this.ram)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tGraphics Cards:\t";
		for(GraphicsCard var: this.graphics)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tCases:\t";
		for(Case var: this.case_)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tPower Supplies:\t";
		for(PowerSupply var: this.power)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tMotherboards:\t";
		for(Motherboard var: this.motherboard)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tSSDs:\t";
		for(SSD var: this.ssd)
			return_this = return_this + var;
		
		return_this = return_this + "\n\tHDDs:\t";
		for(HDD var: this.hdd)
			return_this = return_this + var;
		
		return return_this;
	}
}
