package Java8;

import Java8.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
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

