package gov.srpmicnsn.Epar.web.controllers;

import gov.srpmicnsn.Epar.dto.User;
import gov.srpmicnsn.Epar.services.FormatName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping(value = "/register")
    public String showForm( Model model){
        model.addAttribute("user",new User());
        return "register_form";
    }


    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") @Valid User user, BindingResult result,Model model){
        if (result.hasErrors()){
            return "register_form";
        }
        model.addAttribute("user",FormatName.formatName(user));
        return "register_sucess";
    }

    @RequestMapping("/")
    public void handleRequest() {
        throw new RuntimeException("test exception");
    }


    @GetMapping("login")
    public String login(){
        return "login";
    }

}
