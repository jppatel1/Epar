package gov.srpmicnsn.Epar.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NonNull
public class EmployeeId {

    @NotBlank
    String empId;
}
