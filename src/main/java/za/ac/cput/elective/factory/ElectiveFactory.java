package za.ac.cput.elective.factory;

import za.ac.cput.elective.entity.Elective;

public class ElectiveFactory {

    public static Elective createElective(String electCode, String electName,
            int students_enrolled, int spaces_left) {
        
        Elective elect = new Elective.Builder()
                .setElectCode(electCode)
                .setElectName(electName)
                .setStudents_enrolled(students_enrolled)
                .setStudents_enrolled(students_enrolled)
                .setSpaces_left(spaces_left)
                .build();
        return elect;
    }

}
