package gov.srpmicnsn.Epar.services;

import gov.srpmicnsn.Epar.dto.EmployeeId;

public class LoginAuthentication {
    public static boolean checkUser(EmployeeId id){
        if(id.getEmpId().equals( "01010")){
            return true;
        }
        return false;
    }
}
