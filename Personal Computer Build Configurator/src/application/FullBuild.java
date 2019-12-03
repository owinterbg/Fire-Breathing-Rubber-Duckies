package application;

import java.text.DecimalFormat;

public class FullBuild {
	private CPU cpu;
	private RAM ram;
	private GraphicsCard graphics;
	private Case case_;
	private PowerSupply power;
	private Motherboard motherboard;
	private SSD ssd;
	private HDD	hdd;
	private double total_price;
	
	//getters and setters
	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public GraphicsCard getGraphics() {
		return graphics;
	}

	public void setGraphics(GraphicsCard graphics) {
		this.graphics = graphics;
	}

	public Case getCase_() {
		return case_;
	}

	public void setCase_(Case case_) {
		this.case_ = case_;
	}

	public PowerSupply getPower() {
		return power;
	}
	
	public void setPower(PowerSupply power) {
		this.power = power;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public SSD getSsd() {
		return ssd;
	}

	public void setSsd(SSD ssd) {
		this.ssd = ssd;
	}

	public HDD getHdd() {
		return hdd;
	}

	public void setHdd(HDD hdd) {
		this.hdd = hdd;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public FullBuild(CPU cpu, RAM ram, GraphicsCard graphics, Case case_, PowerSupply power, Motherboard motherboard, SSD ssd, HDD hdd)
	{
		this.cpu = cpu;
		this.ram = ram;
		this.graphics = graphics;
		this.case_ = case_;
		this.power = power;
		this.motherboard = motherboard;
		this.ssd = ssd;
		this.hdd = hdd;
		
		this.total_price = calcTotalPrice();
	}

	private double calcTotalPrice() {
		double return_this = 0;
		return_this += this.cpu.getPrice();
		return_this += this.ram.getPrice();
		return_this += this.graphics.getPrice();
		return_this += this.case_.getPrice();
		return_this += this.power.getPrice();
		return_this += this.motherboard.getPrice();
		return_this += this.ssd.getPrice();
		return_this += this.hdd.getPrice();
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		return Double.parseDouble(df.format(return_this));
	}
	
	public String toString() {
		String return_this = "Complete Build:\n\t" + this.cpu.toString() +
				"\n\t" + this.ram.toString() +
				"\n\t" + this.graphics +
				"\n\t" + this.case_ +
				"\n\t" + this.power +
				"\n\t" + this.motherboard +
				"\n\t" + this.ssd +
				"\n\t" + this.hdd +
				"\n\n\tTotal Cost:\t" +this.total_price + "\n";
		
		return return_this;
	}
	
}
