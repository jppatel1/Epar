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


   /* @GetMapping("/login")
    public String login(Model model){
        int a=0;
        model.addAttribute("id",a);
        return "login";
    }*/

    @RequestMapping("/login")
    public String login(@RequestParam(value = "id",required = false) Integer id,Model model) {

    if(id != null) {
        model.addAttribute("id",id);
        log.info("id {}", id);
        return "success";
    }
        model.addAttribute("id",0);
        return "login";
    }

    /*@PostMapping(value = "/login")
    public String login(){
        log.debug("problem");
        return "success";
    }*/
}
