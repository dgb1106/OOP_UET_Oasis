public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    public Person() {}

    /**
     * constructor with full parameters.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person p) {
        int nameComparison = this.name.compareTo(p.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.age, p.age);
    }
}