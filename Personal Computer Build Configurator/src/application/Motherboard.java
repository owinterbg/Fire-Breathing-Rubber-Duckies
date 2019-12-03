package application;

public class Motherboard {
	private String discription;                   
	private double price;                         
	private String build_type;                    
	private int quality;                          
	   
	public Motherboard(int quality, String build_type, String discrpition, double price) {
		this.discription = discrpition;
		this.price = price;
		this.build_type = build_type;
		this.quality = quality;
	}
	
	//getters and setters
	public String getDiscription() {              
		return discription;                       
	}                                             
	public void setDiscription(String discription) {
		this.discription = discription;           
	}                                             
	public double getPrice() {                    
		return price;                             
	}                                             
	public void setPrice(double price) {          
		this.price = price;                       
	}                                             
	public String getBuild_type() {               
		return build_type;                        
	}                                             
	public void setBuild_type(String build_type) {
		this.build_type = build_type;             
	}                                             
	public int getQuality() {                     
		return quality;                           
	}                                             
	public void setQuality(int quality) {         
		this.quality = quality;                   
	} 
	
	public String toString() {
		String return_this = "Discription:\t" + discription + "\nPrice:\t" + price;
		
		return return_this;
	}
}
