public class StudentManagement {

    private Student[] students = new Student[100];
    private int count = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    /**
     * Adds a new student to the student array.
     *
     * @param newStudent The student to be added.
     */
    public void addStudent(Student newStudent) {
        if (count < 100) {
            students[count] = newStudent;
            count++;
        }
    }

    /**
     * Returns a string that lists all students grouped by their class.
     *
     * @return A formatted string listing students by group.
     */
    public String studentsByGroup() {
        StringBuilder ans = new StringBuilder();
        boolean[] printed = new boolean[count];

        for (int i = 0; i < count; i++) {
            if (!printed[i]) {
                String currentGroup = students[i].getGroup();
                ans.append(currentGroup).append("\n");
                for (int j = 0; j < count; j++) {
                    if (students[j].getGroup().equals(currentGroup)) {
                        ans.append(students[j].getInfo()).append("\n");
                        printed[j] = true;
                    }
                }
            }
        }

        return ans.toString();
    }

    /**
     * Removes a student from the array by their ID.
     *
     * @param id The ID of the student to be removed.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                return;
            }
        }
    }

    /**
     * The main method to test StudentManagement functionalities.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        StudentManagement test = new StudentManagement();

        Student s1 = new Student("dgb", "23021475", "23021475@vnu.edu.vn");
        Student s2 = new Student("Bob", "23021303", "23021303@vnu.edu.vn");
        Student s3 = new Student("Kenneth", "23020479", "23020479@vnu.edu.vn");

        test.addStudent(s1);
        test.addStudent(s2);
        test.addStudent(s3);

        System.out.println(sameGroup(s1, s2));
        System.out.println(test.studentsByGroup());
    }
}
