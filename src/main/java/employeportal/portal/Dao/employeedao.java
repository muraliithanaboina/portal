package employeportal.portal.Dao;

import employeportal.portal.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface employeedao extends JpaRepository<Employee,Long> {

    Optional<Employee> findById(Long id);
}
