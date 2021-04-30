import java.util.ArrayList;

public class Resume {
/* TODO
Create a public member inner class Education according to the specifications.*/
    public class Education {
        String major;
        String school;

        public Education(String m, String s) {
            major = m;
            school = s;
        }

        public String getSchool() {
            return school;
        }
        public void setSchool(String school) {
            this.school = school;
        }

        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major = major;
        }

        @Override
        public String toString() {
            return major + " at " + school;
        }
    }
/* TODO
Create a public static inner class called Experience, according to the specifications.
            */
    public static class Experience {
        String title;
        int fromYear;
        int toYear;

        public Experience(String t, int sy, int ey) {
            title = t;
            fromYear = sy;
            toYear = ey;
        }
        @Override
        public String toString() {
            return fromYear + "-" + toYear + ": " + title;
        }
    }
/* TODO
Create the Person and List of Education and List of experience objects. They should be private.*/
    private Person person;
    private ArrayList<Education> educations;
    private ArrayList<Experience> experiences;

    public Resume(Person p){
/* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work.
*/
        person = p;
        educations = new ArrayList<>();
        experiences = new ArrayList<>();
    }

/* TODO
Create the addEducation, addExperience and override the toString methods as specified.
            */
    public void addEducation(Education e){
        educations.add(e);
    }

    public void addExperience(Experience e){
        experiences.add(e);
    }

    @Override
    public String toString() {
        String out = person + "\nExperience\n";
        for (Experience e: experiences){ out += "\t" + e + "\n"; }
        out += "Education\n";
        for (Education  e: educations) { out += "\t" + e + "\n"; }
        return out;
    }
}
