package DesignPattern.creational.Builder;

public class BuilderDriver {

    public static void main(String[] args) {

//        Address address = Address.builder()
//                .withHouseNumber("123456")
//                .withCity("City1")
//                .withCountry("India")
//                .withDistrict("District")
//                .withPin("980123")
//                .withState("state")
//                .build();
//
//        Employee employee = Employee.builder()
//                .withEmpId(UUID.randomUUID().toString())
//                .withFirstName("FirstName")
//                .withLastName("LastName")
//                .withAddress(address)
//                .build();
//        System.out.println(employee);

        Student student = Student.builder()
                .withUsn("12345")
                .withStudentName("Manish")
                .withMajor("CSE")
                .build();
        System.out.println(student);
    }
}
