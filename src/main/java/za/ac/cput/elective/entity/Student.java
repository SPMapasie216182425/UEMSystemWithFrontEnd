package za.ac.cput.elective.entity;

/* Student class
Author: Sean Trainor 218060033
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student {

    @Id
    private String studentID;
    private int year;
    private String stream;
    private char gender;
    private String enrolledFor;
    private String contactID;
    private String password;

    protected Student() {
    }

    public Student(Builder b) {
        this.studentID = b.studentID;
        this.stream = b.stream;
        this.year = b.year;
        this.gender = b.gender;
        this.enrolledFor = b.enrolledFor;
        this.contactID = b.contactID;
        this.password = b.password;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getYear() {
        return year;
    }

    public String getStream() {
        return stream;
    }

    public char getGender() {
        return gender;
    }

    public String getEnrolledFor() {
        return enrolledFor;
    }

    public String getContactID() {
        return contactID;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Student{"
                + "studentID='" + studentID
                + ", year=" + year
                + ", stream='" + stream
                + ", gender='" + gender
                + ", enrolledFor='" + enrolledFor
                + ", contactID='" + contactID
                + ", password='" + password + '\''
                + '}';

    }

    public static class Builder {

        private String studentID;
        private int year;
        private String stream;
        private char gender;
        private String enrolledFor;
        private String contactID;
        private String password;

        public Builder setContactID(String contactID) {
            this.contactID = contactID;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setGender(char gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEnrolledFor(String enrolledFor) {
            this.enrolledFor = enrolledFor;
            return this;
        }

        public Builder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setStream(String stream) {
            this.stream = stream;
            return this;
        }

        public Builder copy(Student s) {
            this.studentID = s.studentID;
            this.stream = s.stream;
            this.year = s.year;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student s = (Student) o;
        return studentID.equals(s.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }
}
