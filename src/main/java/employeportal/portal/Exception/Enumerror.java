package employeportal.portal.Exception;


public enum Enumerror {
   Employee_not_found("404"),
  Employeeaddress_Not_found("404");
    private String value="";

    Enumerror(String value) {
        this.value = value;
    }
}
