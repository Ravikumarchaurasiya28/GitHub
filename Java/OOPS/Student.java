public class Student implements Comparable<Student> {
    private String name;
    Student(String name) {
        this.name = name;
    }
    public boolean compare(Student other) {
        return this.name == other.name;
    }
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}
