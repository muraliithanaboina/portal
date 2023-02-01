package employeportal.portal.Dao;

import employeportal.portal.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class CustomEmployeedaoimpl implements  CustomEmployeedao{
    @Autowired
    private EntityManager entityManager;
    public ResponseEntity<Employee> getbyemployeename(String name){
        CriteriaBuilder cri=entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> cq=cri.createQuery(Employee.class);

//select the root entity

        Root<Employee>ap=cq.from(Employee.class);
        //kept the conditions
        Predicate dte=cri.equal(ap.get("name"),name);

        cq.select(ap);

        cq.where(dte);

        TypedQuery<Employee> typedQuery = entityManager.createQuery(cq);
        return  new ResponseEntity<Employee>((Employee) typedQuery.getResultList(),HttpStatus.OK);
    }

    }

