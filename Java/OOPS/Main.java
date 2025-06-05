import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
        Student ravi = new Student("Ravi");
        Student aryan = new Student("Aryan");
        System.out.println(ravi.compare(aryan));
        System.out.println(ravi.compareTo(aryan) > 0);
    }
}
