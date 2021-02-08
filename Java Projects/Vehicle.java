

public abstract class Vehicle {
 
        private String ownerName;
        private int numOfWheels;
 
        public Vehicle() {} // default constructor
 
        public Vehicle(String name, int wheels) { // overloaded constructor
                this.ownerName = name;
                this.numOfWheels = wheels;
        }
}
