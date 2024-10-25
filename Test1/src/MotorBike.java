public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor with all parameters.
     */
    public MotorBike(String brand, String model, String registrationNumber, 
    Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Motor Bike:\n");
        s.append("\t" + "Brand: " + this.getBrand() + "\n");
        s.append("\t" + "Model: " + this.getModel() + "\n");
        s.append("\t" + "Registration Number: " + this.getRegistrationNumber() + "\n");
        s.append("\t" + "Has Side Car: " + this.hasSidecar + "\n");
        s.append("\t" + "Belongs to " + this.getOwner().getName() 
        + " - " + this.getOwner().getAddress() + "\n");
        return s.toString();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}