package gov.srpmicnsn.Epar.web.controllers;

import gov.srpmicnsn.Epar.dto.User;
import gov.srpmicnsn.Epar.services.FormatName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @RequestMapping(value = "/register")
    public String showForm( Model model){
        User user = new User();
        System.out.println("Calling befor getAttribute "+ user.getFirstName());
        model.addAttribute("user",user);
        System.out.println("Calling after getAttribute "+user.getFirstName());
        return "register_form";
    }


    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user,Model model){
        System.out.println("Calling from Post Mapping before changing "+user.getFirstName());
        user = FormatName.formatName(user);
        model.addAttribute("user",user);
        System.out.println("Calling from Post Mapping after Changeging "+user.getFirstName());
        return "register_sucess";
    }


    @GetMapping("login")
    public String login(){
        return "login";
    }

}
