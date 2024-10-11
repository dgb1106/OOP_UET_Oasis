public class Person {
    private String name;
    private String address;

    /**
     * constructor with two parameters.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * method to get person name.
     * @return name the declared name
     */
    public String getName() {
        return name;
    }

    /**
     * method to modify name.
     * @param name the name after modification
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method to get person address.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * method to modify the person address.
     * @param address the address to modify
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * method to return the string contains all information.
     * @return string
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}