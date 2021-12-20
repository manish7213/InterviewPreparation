package Serialization;

import Serialization.model.Student;

import java.io.*;

public class SerializationDemo{

    public void serialize(Student student) throws IOException {

        System.out.println("Serialization started");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
        oos.writeObject(student);
        System.out.println("Serialization Ended");
    }

    public Student deserialize(String fileName) throws IOException, ClassNotFoundException {
        System.out.println("Deserialization Started!!");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        Student deserializedStudent = (Student) ois.readObject();
        System.out.println("Deserialization Ended!!");
        return deserializedStudent;
    }
}

class SerializableMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationDemo serializationDemo = new SerializationDemo();
        Student student = new Student("Manish", 123L);
        serializationDemo.serialize(student);

        /*************************************/

        Student deserialize = serializationDemo.deserialize("file.ser");

        System.out.println(deserialize);

    }

}

