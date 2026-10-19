package my.utm.scsc3203.week02;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "index";  //logical view name -> templates/index.html
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("name", "Sai Vajhra");
        model.addAttribute("email", "sai.vajhra@example.com");
        model.addAttribute("programme", "Bachelor of Computer Science");
        model.addAttribute("year", 2);
        model.addAttribute("courses", List.of("SCSC3203 Special Topics", "Database"));
        return "profile";
    }
}


