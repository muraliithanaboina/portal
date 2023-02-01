package employeportal.portal.service;

import employeportal.portal.Dao.CustomEmployeedao;
import employeportal.portal.Dao.employeedao;
import employeportal.portal.Exception.Applicationerror;
import employeportal.portal.Exception.Enumerror;
import employeportal.portal.Exception.applicationex;
import employeportal.portal.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class employeimpl implements  employeeinteract {
    @Autowired
    private employeedao employeedao;
    @Autowired
    private CustomEmployeedao customEmployeedaos;

    @Override
    public ResponseEntity<Employee> getemployee(Long Id) {

     Optional<Employee> emppp = null;
     try {
         emppp = employeedao.findById(Id);

     }catch (Exception ex){
         new applicationex("Notfound by id",ex.getCause(), Enumerror.Employeeaddress_Not_found);

     }

        return new ResponseEntity<Employee>(emppp.get(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updateemployee(Long id,Employee employee) {

        Optional<Employee> empppup = null;
        try {
            empppup = employeedao.findById(id);

        }catch (Exception ex){
            new applicationex("Notfound by id",ex.getCause(), Enumerror.Employeeaddress_Not_found);

        }
        employeedao.save(empppup.get());
        return new ResponseEntity<>("sucess",HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> saveemloyee(Employee employee) {
  Employee employe= employeedao.save(employee);



        return new ResponseEntity<Employee>(employe,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteemployee(Long Id) {
        try {


            employeedao.deleteById(Id);
        }
        catch (Exception ex){
            new applicationex("Notfound by id",ex.getCause(), Enumerror.Employeeaddress_Not_found);

        }
        return  new ResponseEntity<>("sucess",HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Employee> getbyemployeename(String employeename) {
        return customEmployeedaos.getbyemployeename(employeename);
    }
}
