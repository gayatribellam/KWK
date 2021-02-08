
public class CarRepairShop {
	
	
	  public int numCars;
	  
	   public int current_ticket;
	   
	   public Car[] carArray = new Car[100000];
	   public RepairTicket[] repairTicketArray= new RepairTicket[100000];

	   public CarRepairShop()
	   {
	   numCars = 0;
	   
	 
	   current_ticket = 0;

	   }
	public int addNewCar(String vin, String make, int year)
	{
	   for (int i = 0; i < numCars ; i++ )
	   {
	       if(carArray[i].getVIN().equals(vin))
	       {
	          
	       return -1;
	       }
	   }
	       Car car = new Car(vin,make,year);
	       carArray[numCars] = car;
	       numCars +=1;
	       return numCars;
	}
	  
	  
	public int addRepairTicket(String vin, double cost, String description)
	{
	  

	   for (int i = 0; i < numCars ; i++ ) {
	   if(carArray[i].getVIN().equals(vin)){

	   repairTicketArray[current_ticket] = new RepairTicket(vin, cost, description,current_ticket+1);
	   current_ticket +=1;
	   return current_ticket;
	  
	   }
	   }

	   return -1;
	}
	  
	  
	public double getRepairCost(int ticketNum)
	{
	
	   for (int i = 0; i < current_ticket ; i ++ ) {
	   if(repairTicketArray[i].getTicketNum() == ticketNum){
	   return repairTicketArray[i].getCost();
	   }
	   }
	   return -1.0;
	}
	  
	public double getTotalRepairCosts(String vin)
	{
	  
	   double sum = 0.0;
	   boolean check = false;
	   for (int i = 0; i < current_ticket ; i ++ ) {
	   if(repairTicketArray[i] != null && repairTicketArray[i].getVIN().equals(vin)){
	   sum += repairTicketArray[i].getCost();
	   check = true;
	   }
	   }
	   if(!check) 
		   return -1.0;
	   return sum;
	}

	public String getWorstCarMake()
	{
	  
	   String ans = null;
	   double max = 0.0;
	   for (int i = 0; i < numCars ; i++ ) {
	   if(carArray[i]!= null){
	   if(max < getTotalRepairCosts(carArray[i].getVIN())){
	   ans = carArray[i].getMake();
	   }
	   }
	   }

	   return ans;
	}
	  
	public boolean updateRepairCost(int ticketNum, double newCost) {
	
	   for (int i = 0; i < current_ticket ; i ++ ) {
	   if(repairTicketArray[i] != null && repairTicketArray[i].getTicketNum() == ticketNum){
	   repairTicketArray[i].setCost(newCost); 
	   return true;
	   }
	   }

	   return false;
	}
	  
	public boolean deleteRepair(int ticketNum)
	{
	   
	   for (int i = 0; i < current_ticket ; i ++ ) {
	   if(repairTicketArray[i] != null && repairTicketArray[i].getTicketNum() == ticketNum){
	   repairTicketArray[i] = null;
	   return true;
	   }
	   }

	   return false;
	}
	  
	public boolean deleteAllRepairsForCar(String VIN)
	{
	   boolean check = false;
	   for (int i = 0; i < current_ticket ; i ++ ) {
	   if(repairTicketArray[i]!= null && repairTicketArray[i].getVIN().equals(VIN) ) {
	   repairTicketArray[i] = null;
	   check = true;

	   }
	   }

	   return check;
	}
	  

	   public boolean deleteCarAndRepairs(String vin)
	   {
	       for (int i = 0; i < current_ticket ; i ++ ) {
	       if(repairTicketArray[i]!= null && repairTicketArray[i].getVIN().equals(vin) ) {
	       repairTicketArray[i] = null;
	      

	       }
	       }
	       boolean check = false;
	       for (int i = 0; i < numCars ; i++ ) {
	       if(carArray[i]!= null && carArray[i].getVIN().equals(vin)){
	       carArray[i] = null;
	       check = true;
	       }
	       }

	       return check;
	  
	   }
	
	
	
	
	
	
	
	
}
