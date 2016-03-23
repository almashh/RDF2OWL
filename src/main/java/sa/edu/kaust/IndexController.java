package sa.edu.kaust;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(
            @RequestParam(value="name", required=false, defaultValue="World") String name,
            Model model) {
        model.addAttribute("name", name);
        return "index";
    }

}
