import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Resume {
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
/* TODO Create a member variable of type Person (exactly as in task 2)
 */
/* TODOCreate a List to hold values of type Education (exactly as in task 2)
 */
    private Person person;
    private ArrayList<Education> educations;
/* TODO Create a Priority Queue that holds values of type Experience.
 */
    private PriorityQueue<Experience> experiences;

    public Resume(Person p){
/* TODO Assign a value to the Person variable.
 */
        /* TODO Initialize the List with Education objects.
         */
        /* TODO Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.
         */
        person = p;
        educations = new ArrayList<>();
        experiences = new PriorityQueue<Experience>(10, new Comparator<Experience>() {
            @Override
            public int compare(Experience e1, Experience e2) {
                if (e1.fromYear == e2.fromYear) return 0;
                return e1.fromYear > e2.fromYear ? -1 : 1;
            }
        });

    }

/* TODO Add a standard getter for the experiences. getExperience. it should return a priority queue.
 */

    public PriorityQueue<Experience> getExperience() {
        return experiences;
    }
    /* TODO Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)
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
