package Cloneable;

public class Student extends Person implements Cloneable {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization
                + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public int skipDays(int numberOfDays) {
        return skippedDays += numberOfDays;
    }

    @Override
    public void clone(Student inputStudent) {
        Student clonedStudent = new Student();
        clonedStudent = inputStudent;
        clonedStudent.name = inputStudent.name + "-TheClone";

        System.out.println("You have cloned a new student who introduce himself:  ");
        clonedStudent.introduce();
    }
}
