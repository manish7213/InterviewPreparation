package DesignPattern.creational.Builder;

public class Student {

    private String usn;
    private String studentName;
    private String major;

    @Override
    public String toString() {
        return "Student{" +
                "usn='" + usn + '\'' +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String usn;
        private String studentName;
        private String major;

        public Builder withUsn(String usn) {
            this.usn = usn;
            return this;
        }

        public Builder withStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public Builder withMajor(String major) {
            this.major = major;
            return this;
        }

        public Student build() {
            // Required validation to build the object
            Student student = new Student();
            student.usn = usn;
            student.studentName = studentName;
            student.major = major;

            return student;
        }
    }
}
