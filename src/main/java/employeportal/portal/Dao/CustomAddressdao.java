package employeportal.portal.Dao;

import employeportal.portal.models.Employee;
import employeportal.portal.models.EmployeeAddress;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CustomAddressdao {
    public ResponseEntity<EmployeeAddress> getbyaddresstype(String addressype);
}
