package employeportal.portal.Dao;

import employeportal.portal.models.Employee;
import employeportal.portal.models.EmployeeAddress;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Optional;

@Repository
public class customdaoimpl implements CustomAddressdao {
    private EntityManager entityManager;

    public ResponseEntity<EmployeeAddress> getbyaddresstype(String addressype) {
        //create critiria bulider //select what will the output
        CriteriaBuilder cri = entityManager.getCriteriaBuilder();
        CriteriaQuery<EmployeeAddress> cq = cri.createQuery(EmployeeAddress.class);

        //select the root entity

        Root<EmployeeAddress> cp = cq.from(EmployeeAddress.class);

        //kept the conditions
        Predicate dte = cri.equal (cp.get("addresstype"), addressype);

        cq.select(cp);

        cq.where(dte);

        TypedQuery<EmployeeAddress> typedQuery = entityManager.createQuery(cq);
        return  new ResponseEntity<EmployeeAddress>(typedQuery.getSingleResult(), HttpStatus.OK);
    }
}