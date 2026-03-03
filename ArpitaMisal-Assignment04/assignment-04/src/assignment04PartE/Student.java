package assignment04PartE;

/**
 *
 * Part E
 *
 */

public final class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final int id;
    private final double gpa;
    private final int smallQuestion;
    private final int bigQuestion;
    private static String comparePriority;

    public Student(String firstName, String lastName, int id, double gpa, int smallQuestion, int bigQuestion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gpa = gpa;
        this.smallQuestion = smallQuestion;
        this.bigQuestion = bigQuestion;
    }

    public static String[] getPriorities() {
        return new String[]{"realistic (provided by supervisors)", "first-name", "last-name",
                "student-id", "gpa", "number-of-small-questions", "number-of-big-questions",
                "number-of-small-and-big-questions"};
    }

    public static void setCompareToPriority(String priority) {
        comparePriority = priority;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getId() {
        return this.id;
    }

    public double getGpa() {
        return this.gpa;
    }

    public int getSmallQuestion() {
        return this.smallQuestion;
    }

    public int getBigQuestion() {
        return this.bigQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        }
        Student s = (Student) o;
        return this.getFirstName() == s.getFirstName();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
//        String s1 = String.format("%32.12f", this.firstName);
//        String s2 = String.format("%32.12f", this.lastName);
//        String s3 = String.format("%32.12f", this.id);
//        String s4 = String.format("%32.12f", this.gpa);
//        String s5 = String.format("%32.12f", this.smallQuestion);
//        String s6 = String.format("%32.12f", this.bigQuestion);

        return String.format("%10s%-10s%-10s%-10d%-5.2f%8d%8d",
                "", this.firstName, this.lastName, this.id, this.gpa, this.smallQuestion, this.bigQuestion);
        //        return s1 + " " + s2 + " " + s3 + " " + s3 + " " + s4 + " " + s5 + " " + s6;
    }

    @Override
    public int compareTo(Student student) {

        String[] s = getPriorities();

        String fName = student.firstName;
        String lName = student.lastName;
        int i = student.id;
        double gPA = student.gpa;
        int sQuestion = student.smallQuestion;
        int bQuestion = student.bigQuestion;

        if (comparePriority.equals(s[0])) {
            String name = this.lastName;
            String oname = student.lastName;;
            if(name.equals("Mouse") && oname.equals("Mouse")){
                name = this.firstName;
                oname = student.firstName;
                return -name.compareTo(oname);
            }
            else if(this.lastName.equals("Mouse") || student.equals("Mouse")){
                if(this.lastName.equals("Mouse")){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        }

        if (comparePriority.equals(s[1])) {
            if (this.getFirstName().compareTo(fName) < 0) {
                return -1;
            }

            if (this.getFirstName().compareTo(fName) > 0) {
                return 1;
            }

            if (this.getClass().equals(fName)) {
                return this.getLastName().compareTo(lName);
            }
        }

        if (comparePriority.equals(s[2])) {
            if (this.getLastName().compareTo(lName) < 0) {
                return -1;
            }

            if (this.getLastName().compareTo(lName) > 0) {
                return 1;
            }

            if (this.getClass().equals(lName)) {
                return this.getLastName().compareTo(lName);
            }
        }
        if(comparePriority.equals(s[3])) {
            if (this.getId() < i) {
                return -1;
            }
            if (this.getId() > i) {
                return 1;
            }
            if (this.getId() == i) {
                return this.getLastName().compareTo(lName);
            }
        }
        if(comparePriority.equals(s[4])) {
            if (this.getGpa() < gPA) {
                return -1;
            }
            if (this.getGpa() > gPA) {
                return 1;
            }
            if (this.getGpa() == gPA) {
                return this.getLastName().compareTo(lName);
            }
        }
        if(comparePriority.equals(s[5])) {
            if (this.getSmallQuestion() < sQuestion) {
                return -1;
            }
            if (this.getSmallQuestion() > sQuestion) {
                return 1;
            }
            if (this.getSmallQuestion() == sQuestion) {
                return this.getLastName().compareTo(lName);
            }
        }
        if(comparePriority.equals(s[6])) {
            if (this.getBigQuestion() < bQuestion) {
                return -1;
            }
            if (this.bigQuestion > bQuestion) {
                return 1;
            }
            if (this.getBigQuestion() == bQuestion) {
                return this.getLastName().compareTo(lName);
            }
        }
        if(comparePriority.equals(s[7])) {
            if (this.getBigQuestion() + getSmallQuestion() < bQuestion + sQuestion) {
                return -1;
            }
            if (this.bigQuestion + this.smallQuestion > bQuestion + sQuestion) {
                return 1;
            }
            if (this.getSmallQuestion() + this.getBigQuestion() == sQuestion + bQuestion) {
                return this.getLastName().compareTo(lName);
            }
        }
        // Wrong types compared
        return 0;
    }
}