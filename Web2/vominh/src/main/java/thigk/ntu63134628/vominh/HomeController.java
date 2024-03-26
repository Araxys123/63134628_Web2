package thigk.ntu63134628.vominh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

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
        students.add(new Student("Võ Minh", "63.CNTT-CLC", "Web2", "Nha Trang University"));
        model.addAttribute("students", students);

        return "index";
    }
}

