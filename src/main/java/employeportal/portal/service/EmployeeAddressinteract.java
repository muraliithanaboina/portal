package employeportal.portal.service;

import employeportal.portal.models.Employee;
import employeportal.portal.models.EmployeeAddress;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Service
public interface EmployeeAddressinteract {
    public ResponseEntity<EmployeeAddress> saveemployee(EmployeeAddress employeeaddress);
    public  ResponseEntity<String>  updateemployee( Long Id, EmployeeAddress employeeaddress);
    public ResponseEntity<EmployeeAddress> getbyaddresstype(String addressype);
}
