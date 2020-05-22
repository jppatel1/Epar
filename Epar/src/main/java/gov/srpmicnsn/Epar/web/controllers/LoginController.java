package gov.srpmicnsn.Epar.web.controllers;


import gov.srpmicnsn.Epar.services.LoginAuthentication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@Slf4j
public class LoginController {


    @GetMapping("/login")
    public String login(Model model){
        int a=0;
        model.addAttribute("id",a);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam Integer id) {
        System.out.println(id);
        return "login";
    }

    /*@PostMapping(value = "/login")
    public String login(){
        log.debug("problem");
        return "success";
    }*/
}
