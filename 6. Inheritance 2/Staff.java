public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * constructor with multiple parameters.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * method to get school where the staff works.
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * method to modify the school where the staff works.
     * @param school the school to modify
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * method to get the payment amount for that staff.
     * @return pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * method to modify the payment amount for the staff.
     * @param pay the amount to modify
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * method to override the method toString() in the class Person.
     * @return string
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school
        + ",pay=" + pay + "]";
    }
}