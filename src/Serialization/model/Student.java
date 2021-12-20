package Serialization.model;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private long Id;

    public Student(String name, long id) {
        this.name = name;
        Id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
