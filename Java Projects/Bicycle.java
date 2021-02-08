
public class Bicycle extends Vehicle {
 
        private String ownerName;
        private int numOfWheels;
 
        public Bicycle() {}
 
        public Bicycle(String name) {
                ownerName = name;
                numOfWheels = 2;
        }
 
        public String getOwnerName() {
                return this.ownerName;
        }
 
        public int getNumOfWheels() {
                return this.numOfWheels;
        }
}
