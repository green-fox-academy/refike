package TeacherStudent;

public class main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher ();
        Student student1 = new Student();
        student1.question(teacher1);
        teacher1.teach(student1);

    }
}
