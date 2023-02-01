package employeportal.portal.Dao;

import employeportal.portal.models.Employee;
import employeportal.portal.models.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeaddresss extends JpaRepository<EmployeeAddress,Long> {
}
