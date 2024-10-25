import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList;

    /**
     * constructor with all parameters.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * method to remove vehicle.
     * @param registrationNumber the registrationNumber to remove
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle v : vehicleList) {
            if (v.registrationNumber.equals(registrationNumber)) {
                vehicleList.remove(v);
                return;
            }
        }
    }

    /**
     * method to retrieve all info of vehicles.
     * @return string s
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }
        StringBuilder s = new StringBuilder();
        s.append(this.name + " has:\n\n");
        for (Vehicle v : vehicleList) {
            s.append(v.getInfo());
        }
        return s.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}