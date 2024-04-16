package thigk.ntu63134628.vominh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    void addStudent(Student student);
    @Autowired
    public static final StudentRepository studentRepository = null;
}

