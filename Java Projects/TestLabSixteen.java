
public class TestLabSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle racer = new Bicycle("Emily");
        System.out.println("Owner = "+racer.getOwnerName());
        System.out.println("Wheels = "+racer.getNumOfWheels());

        MotorizedVehicle car = new MotorizedVehicle("Mary", 4, 3.2);         
        System.out.println("Vehicle owner = "+car.getOwnerName());
        System.out.println("Wheels = "+car.getNumOfWheels());
        System.out.println("Engine Volume Displacement = " + car.getEngineVolD());
        System.out.println("Horse Power = "+car.getHorsePower());

	}

}
