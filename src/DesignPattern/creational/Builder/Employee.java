package DesignPattern.creational.Builder;

public class Employee {

    private String empId;
    private String firstName;
    private String lastName;
    private double salary;
    private Address address;

    private boolean isPermanent;
    private String band;
    private String designation;

    public static Builder builder() {
        return new Builder();
    }

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public String getBand() {
        return band;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                ", isPermanent=" + isPermanent +
                ", band='" + band + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public static class Builder {
        private String empId;
        private String firstName;
        private String lastName;
        private double salary;
        private Address address;

        private boolean isPermanent;
        private String band;
        private String designation;

        public Builder withEmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder withPermanent(boolean isPermanent) {
            this.isPermanent = isPermanent;
            return this;
        }

        public Builder withBand(String band) {
            this.band = band;
            return this;
        }

        public Builder withDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public Employee build() {
            if (this.empId == null || this.firstName == null || this.lastName == null) {
                throw new RuntimeException("EmpId , firstName and lastName are mandatory fields");
            }
            Employee employee = new Employee();
            employee.empId = empId;
            employee.firstName = firstName;
            employee.lastName = lastName;
            employee.salary = salary;
            employee.address = address;
            employee.isPermanent = isPermanent;
            employee.band = band;
            employee.designation = designation;

            return employee;
        }
    }


}
