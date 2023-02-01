package employeportal.portal.service;


import employeportal.portal.Dao.CustomAddressdao;
import employeportal.portal.Exception.Enumerror;
import employeportal.portal.Exception.applicationex;
import employeportal.portal.controller.employeeaddresscontrol;
import employeportal.portal.models.Employee;
import employeportal.portal.models.EmployeeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public class EmployeeAddreessimpl implements  EmployeeAddressinteract {
    @Autowired
    private employeportal.portal.Dao.employeeaddresss employeeaddresss;
    @Autowired
    private CustomAddressdao customAddressdao;
    @Override
    public ResponseEntity<EmployeeAddress> saveemployee(EmployeeAddress employeeaddress) {
    EmployeeAddress Eployeeadd=employeeaddresss.save(employeeaddress);
    return new ResponseEntity<EmployeeAddress>(Eployeeadd, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updateemployee(Long Id, EmployeeAddress employeeaddress) {
       Optional< EmployeeAddress> empppup;
        try {
            empppup = employeeaddresss.findById(Id);

        }catch (Exception ex){
            new applicationex("Notfound by id",ex.getCause(), Enumerror.Employeeaddress_Not_found);

        }
        return new ResponseEntity<>("sucess",HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EmployeeAddress> getbyaddresstype(String addressype) {
        return customAddressdao.getbyaddresstype(addressype);
    }
}
