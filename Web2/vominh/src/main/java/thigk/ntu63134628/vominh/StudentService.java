package thigk.ntu63134628.vominh;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    void addStudent(Student student);
    Student findStudentById(String id);
}

