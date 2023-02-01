package employeportal.portal.controller;

import employeportal.portal.models.Employee;
import employeportal.portal.service.employeeinteract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    private employeeinteract employeeinteract;
    @GetMapping("employee/id")
    public Employee  getemployee(@RequestParam("id")Long id){
ResponseEntity<Employee> empp=employeeinteract.getemployee(id);
return empp.getBody();

    }
    @PutMapping("{Id}")
    public  ResponseEntity<String>  updateemployee(@PathVariable Long Id,@Valid  @RequestBody Employee employee){
 ResponseEntity<String>l= employeeinteract.updateemployee(Id,employee);
 return  l;

    }
    @PostMapping("/saveemployee")
    public ResponseEntity<Employee> saveemployee( @RequestBody Employee emp ){

   System.out.println(emp);
ResponseEntity<Employee>lop=employeeinteract.saveemloyee(emp);
return  lop;

    }
    @DeleteMapping("{Id}")
    public ResponseEntity<String>deleteemployee(@PathVariable Long Id){
ResponseEntity<String>k=employeeinteract.deleteemployee(Id);
return k;
    }
}
