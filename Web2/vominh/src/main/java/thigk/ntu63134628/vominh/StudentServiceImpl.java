package thigk.ntu63134628.vominh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student findStudentById(String id) {
        return StudentService.findById(id).orElse(null);
    }
}
