public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor with all parameters.
     */
    public Car(String brand, String model, String registrationNumber, 
    Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Car:\n");
        s.append("\t" + "Brand: " + this.getBrand() + "\n");
        s.append("\t" + "Model: " + this.getModel() + "\n");
        s.append("\t" + "Registration Number: " + this.getRegistrationNumber() + "\n");
        s.append("\t" + "Number of Doors: " + this.numberOfDoors + "\n");
        s.append("\t" + "Belongs to " + this.getOwner().getName() + " - " 
        + this.getOwner().getAddress() + "\n");
        return s.toString();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}