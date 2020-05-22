package gov.srpmicnsn.Epar.web.controllers;

import gov.srpmicnsn.Epar.dto.User;
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

        return "register_success";
    }
    @RequestMapping("/")
    public void handleRequest() {
        throw new RuntimeException("test exception");
    }


}
