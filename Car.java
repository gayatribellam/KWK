
public class Car {
	
	private String VIN;
	private String Make;
	private int Year;
	
	
	public Car(String vin, String make, int year){
	this.VIN = vin;
	this.Make = make;
	this.Year = year;
	
	}
	
	 public String getVIN() {
		   return VIN;
	   }
	 
	 
	 public String getMake() {
		   return Make;
	   }
	   
	 
	 public int getYear() {
		   return Year;
	   }
	   
	   
	   public void setVIN(String vin) {
		   this.VIN = vin;
	  }
	   
	   public void setMake(String make) {
		   this.Make = make;
		  }
	   
	   
	   public void setYear(int year) {
		   this.Year = year;
		  }
	   
	   
	   
}
