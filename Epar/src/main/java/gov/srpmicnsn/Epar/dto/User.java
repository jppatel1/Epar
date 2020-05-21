package gov.srpmicnsn.Epar.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NotNull
public class User {

    @NotBlank
    @Size(min = 2,max = 18, message = "First name should be between 2 and 18 character long")
    String firstName;

    @NotBlank
    @Size(min = 2,max = 18, message = "First name should be between 2 and 18 character long")
    String lastName;

    @NotBlank
    @Size(min = 2,max = 18, message = "First name should be between 2 and 18 character long")
    String email;
}
