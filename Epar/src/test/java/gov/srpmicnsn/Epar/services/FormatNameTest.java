package gov.srpmicnsn.Epar.services;

import gov.srpmicnsn.Epar.dto.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatNameTest {

    @Test
    public void testFormatName() {
        User user = new User();
        String firstName = "jay";
        String lastName = "patel";
        String email = "jaypatel10673@gmail.com";
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);

        User user1 = FormatName.formatName(user);
        assertEquals("J",user1.getFirstName().substring(0,1));
    }



}
