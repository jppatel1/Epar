package gov.srpmicnsn.Epar.services;

import gov.srpmicnsn.Epar.dto.User;

public class FormatName {
    public static User formatName(User user){
        String firstName = user.getFirstName();
        if(firstName != null || !firstName.equals("")) {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        }
        String lastName = user.getLastName();
        if(lastName != null || !lastName.equals("")) {
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        }
        User user1 = new User();
        user1.setFirstName(firstName);
        user1.setLastName(lastName);
        user1.setEmail(user.getEmail());
        return user1;
    }
}
