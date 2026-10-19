package my.utm.my.utm.scsc3203.week02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  //logical view name -> templates/index.html
    }
}

