package employeportal.portal.Dao;

import employeportal.portal.models.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomEmployeedao {
    public ResponseEntity<Employee> getbyemployeename(String employeename);
}
