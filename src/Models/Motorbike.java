package Models;

public class Motorbike {

	private String model;
	private String trademark;
	private String type;
	private String color;
	private float price;
	private String[] comments;
	
	public Motorbike(String mod,String trad, String typ, float pric,String[] comm) {
		this.model = mod;
		this.trademark = trad;
		this.type = typ;
		this.price = pric;
		this.comments = comm;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getType() {
		return type;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String[] getComments() {
		return comments;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}
	
	
	
}
