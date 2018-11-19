package TeacherStudent;

public class Teacher {


    public void teach(Student student){ // azért hívom le a Student classt és nem a Teacher classt, az az önmagát, mert így tudom csak meghívni a .learn methodot
        student.learn();
    }

    public void answer(){
        System.out.println("this is my answer");

    }
}
