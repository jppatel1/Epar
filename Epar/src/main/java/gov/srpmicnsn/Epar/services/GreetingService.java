package gov.srpmicnsn.Epar.services;

import gov.srpmicnsn.Epar.dto.User;

public class GreetingService {
    public static String generateGreeting(String firstName, String lastName, String email){
        String greeting = "Hello, " + firstName.substring(0,1).toUpperCase() + firstName.substring(1) + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        return  greeting;
    }

}
