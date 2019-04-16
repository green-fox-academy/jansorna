package TeacherStudent;

public class Main {
    public static void main(String[] args) {

        //start testing
        Student pepan = new Student();
        Student anicka = new Student();

        Teacher teacherEnglish = new Teacher();
        Teacher teacherHistory = new Teacher();

        pepan.question(teacherEnglish);
        teacherEnglish.teach(anicka);
        //end testing
    }
}
