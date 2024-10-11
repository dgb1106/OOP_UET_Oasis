public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * constructor with multiple parameters.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * method to get the program of the student.
     * @return program of that student
     */
    public String getProgram() {
        return program;
    }

    /**
     * method to modify the program of the student.
     * @param program the program to modify
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * method to get the current year of student.
     * @return the current year
     */
    public int getYear() {
        return year;
    }

    /**
     * method to modify year.
     * @param year the year to modify
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * method to get the current fee of the student.
     * @return the current fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * method to modify the current fee of the student.
     * @param fee the fee to modify
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * method to override the method toString in the class Person.
     * @return string.
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year="
        + year + ",fee=" + fee + "]";
    }
}