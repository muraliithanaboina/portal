package employeportal.portal.controller;


import employeportal.portal.models.EmployeeAddress;
import employeportal.portal.service.EmployeeAddressinteract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;


@RestController
@Validated
public class employeeaddresscontrol {


    @Autowired
    private EmployeeAddressinteract employeeAddressinteract;
    @PostMapping("saveemployeeaddress")
    public ResponseEntity<EmployeeAddress> saveemployee(@RequestBody EmployeeAddress employeeaddress){
      return employeeAddressinteract.saveemployee(employeeaddress) ;
    }
    @PutMapping("{Id}")
    public  ResponseEntity<String>  updateemployee(@PathVariable Long Id,@Valid @RequestBody EmployeeAddress employeeaddress){

 return employeeAddressinteract.updateemployee(Id,employeeaddress) ;
    }
    @GetMapping("{addresstype}")
    public ResponseEntity<EmployeeAddress> getbyaddresstype(@PathVariable String addressype){
        return employeeAddressinteract.getbyaddresstype(addressype);
    }
}
