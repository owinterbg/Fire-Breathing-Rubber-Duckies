
public class Inventory {
	private String description;
	private String price;
	private String buildType;
	private String quality;
	private String part;
	
	public Inventory(String quality,String buildType, String part , String description, String price)
	{
		this.setQuality(quality);
		this.setBuildType(buildType);
		this.setPart(part);
		this.setDescription(description);
		this.setPrice(price);
		
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
