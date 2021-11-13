package fruit.java;

public class fruits {
	private String name;
	private int calories;
	private int price;
	private String colour;
	
	public fruits(String name,Integer calories,Integer price,String colour) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.colour=colour;
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
    public String toString() {
    	return this.name+ " " + this.calories+ " " + this.price+" " +  this.colour + " ";
    	

    }
    
}


