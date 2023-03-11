package FleetMS.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/account")
    public String account() {
        return "/account/index";
    }

    @GetMapping("/fleet")
    public String fleet() {
        return "/fleet/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk() {
        return "/helpdesk/index";
    }

    @GetMapping("/hr")
    public String hr() {
        return "/hr/index";
    }

    @GetMapping("/payroll")
    public String payroll() {
        return "/payroll/index";
    }

    @GetMapping("/settings")
    public String settings() {
        return "/settings/index";
    }

    @GetMapping("/subject")
    public String subject() {
        return "/subject/index";
    }



}
