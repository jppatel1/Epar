package gov.srpmicnsn.Epar.controllers;

import gov.srpmicnsn.Epar.dto.User;
import gov.srpmicnsn.Epar.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class loginController {

    @RequestMapping(value = "/hello", method = {RequestMethod.POST})
    public String hello(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String email, Model model){
        model.addAttribute("greeting",GreetingService.generateGreeting(firstName,lastName,email));
        return "hello";
    }


    @GetMapping("login")
    public String login(){
        return "login";
    }

}
