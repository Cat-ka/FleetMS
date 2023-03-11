package FleetMS.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/components-accordion")
    public String componentsAccordion() {
        return "components-accordion";
    }
}
