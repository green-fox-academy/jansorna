package TeacherStudent;

public class Student {

    public void learn() {
        System.out.println("Finally I understand it");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
