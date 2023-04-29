import java.util.List;

public interface StudentInterface {

    Student getById(int id);
    void SaveStudent(Student student);
    List<Student> getAll();
}
