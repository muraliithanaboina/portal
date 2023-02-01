package employeportal.portal.service;

import employeportal.portal.models.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;

@Service
public interface employeeinteract {
    public ResponseEntity<Employee> getemployee(Long Id);
    public  ResponseEntity<String>  updateemployee(Long id,Employee employee);
    public ResponseEntity<Employee> saveemloyee(Employee employee);
    public  ResponseEntity<String> deleteemployee(Long Id);
    public ResponseEntity<Employee> getbyemployeename(String employeename);
}
