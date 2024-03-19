package minhvo.DisplayListObject.controlllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import minhvo.DisplayListObject.models.SinhVien;

@Controller
public class SinhVienController { 
	static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
			dsSinhVien.add(new SinhVien("1", "Võ Minh"));
			dsSinhVien.add(new SinhVien("2", "ABC"));
		 }
	@GetMapping("/danhsachSV")
	public String listStudent(ModelMap mm) {
	    mm.addAttribute("dsSV", dsSinhVien);
	    return "sinhvien_getAll";
	}
}
