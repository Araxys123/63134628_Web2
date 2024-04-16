package thigk.ntu63134628.vominh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String showStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/students/new")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student(null, null, null, null, null));
        return "student-form";
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/search")
    public String showSearchForm() {
        return "search-form";
    }

    @PostMapping("/students/search")
    public String searchStudent(@RequestParam("id") String id, Model model) {
        Student student = studentService.findStudentById(id);
        model.addAttribute("student", student);
        return "search-results";
    }
    @GetMapping({"/", "/home"})
    public String index(Model model) {
        // Navbar Bootstrap
        List<String> danhmuc = Arrays.asList("Danh Mục 1", "Danh Mục 2", "Danh Mục 3");
        model.addAttribute("danhMuc", danhmuc);

        // Carousel Bootstrap
        List<String> carouselImages = Arrays.asList("image1.jpg", "image2.jpg", "image3.jpg");
        model.addAttribute("carouselImages", carouselImages);

        // Cards Bootstrap
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", "Võ Minh", "63.CNTT-CLC", "CNTT", "Nha Trang University"));
        students.add(new Student("002", "Trương Đăng Quang", "64.CNTT-1", "CNTT", "Nha Trang University"));
        students.add(new Student("003", "Nguyễn Văn A", "65.CNTT-2", "CNTT", "Nha Trang University"));
        model.addAttribute("students", students);

        return "index";
    }
}

