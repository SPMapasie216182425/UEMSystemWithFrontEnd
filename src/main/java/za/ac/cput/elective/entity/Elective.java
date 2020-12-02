package za.ac.cput.elective.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * @author: Shane  Mapasie, GitHub: SPMapasie216182425
 * Desc: Create Elective.java class with attributes using the Builder pattern
 * Date: 4rd July 2020
 */
@Entity
public class Elective {

    @Id
    private String electCode;
    private String electName;
    // ArrayList<String> electives = new ArrayList<>();
    private String elecDescription;
    private int students_enrolled;
    private int spaces_left;


    /*No argument constructor, protected*/
    protected Elective() {
    }

    /* constructor */
    public Elective(Builder builder) {
        this.electName = builder.electName;
        this.electCode = builder.electCode;
        this.elecDescription = builder.elecDescription;
        this.students_enrolled = builder.students_enrolled;
        this.spaces_left = builder.spaces_left;
    }

    //getters
    public String getElectName() {
        return electName;
    }

    public String getElectCode() {
        return electCode;
    }

    public int getStudents_enrolled() {
        return students_enrolled;
    }

    public int getSpaces_left() {
        return spaces_left;
    }

    public String getElecDescription() {
        return elecDescription;
    }

    //toString Method
    @Override
    public String toString() {
        return "Elective{"
                + "Elective Name=" + electName
                + ", Elective Code=" + electCode + '\''
                + '}';
    }

    public static class Builder {

        private String electName;
        private String electCode;
        private int students_enrolled;
        private int spaces_left;
        private String elecDescription;

        /* setters using builder */
        public Builder setElectName(String electName) {
            this.electName = electName;
            return this;
        }

        public Builder setElectCode(String electCode) {
            this.electCode = electCode;
            return this;
        }
        
        public Builder setelecDescription(String elecDescription) {
            this.elecDescription = elecDescription;
            return this;
        }

        public Builder setStudents_enrolled(int students_enrolled) {
            this.students_enrolled = students_enrolled;
            return this;
        }

        public Builder setSpaces_left(int spaces_left) {
            this.spaces_left = spaces_left;
            return this;
        }
 
        /*Constructor with Builder Implemented*/
        public Builder copy(Elective elect) {
            this.electName = elect.electName;
            this.electCode = elect.electCode;
            this.elecDescription = elect.elecDescription;
            this.students_enrolled = elect.students_enrolled;
            this.spaces_left = elect.spaces_left;

            return this;
        }

        /*Methods*/
        public Elective build() {
            return new Elective(this);
        }

    }//end of builder class
}
