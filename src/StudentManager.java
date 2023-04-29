import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentInterface {

    private static List<Student> students = new ArrayList<>();


    static {
        students.add(new Student(1 , "Minaver" , (byte) 26));
        students.add(new Student(2 , "Sakina" , (byte) 28));
        students.add(new Student(3 , "Lamiye" , (byte) 19));
        students.add(new Student(4 , "Sakar" , (byte) 21));


    }



    @Override
    public Student getById(int id) {
        return students.get(id-1);
    }

    @Override
    public void SaveStudent(Student student) {
        students.add(student);


    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
