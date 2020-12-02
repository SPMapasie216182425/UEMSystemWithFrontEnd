package za.ac.cput.elective.factory;

import za.ac.cput.elective.entity.Student;

import java.util.Random;
import java.util.UUID;

public class StudentFactory {


    public static Student createStudent(String studentID, int year, String stream, char gender, String enrolledFor, String contactID, String password ) {

        Student s = new Student.Builder()
                .setStudentID(studentID)
                .setYear(year)
                .setStream(stream)
                .setGender(gender)
                .setEnrolledFor(enrolledFor)
                .setContactID(contactID)
                .setPassword(password)
                .build();
        return s;
    }

    public static Student chooseElective() {
        return null;
    }

    public static Student cancelElective() {
        return null;
    }
}
