package TeacherStudent;

public class Student {


    public void learn(){
        System.out.println("Student learning");

    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
