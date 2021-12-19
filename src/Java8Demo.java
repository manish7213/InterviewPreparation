import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        List<String> list = List.of("Manish", "Ashish", "Ramesh", "Shiva");

        List<String> collect = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println(collect);

        Student student1 = new Student("Manish", 123);
        Student student2 = new Student("Ram", 124);
        Student student3 = new Student("Manish", 122);
        Student student4 = new Student("Ashish", 125);
        Student student5 = new Student("Vishnu", 126);
        Student student6 = new Student("Manish", 127);

        List<Student> list1 = List.of(student1, student2, student3, student4, student5, student6);

        List<Student> collect1 = list1.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRollNumber)).collect(Collectors.toList());
        System.out.println(collect1);
    }
}

class Student {

    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {

        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
}
