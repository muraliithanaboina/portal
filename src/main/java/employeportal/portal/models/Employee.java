package employeportal.portal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Employee {
    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private Integer age;

    private  String gender;

    private String mobilenumber;
    private String alternatemobnumber;
    private String salary;

    private String emailid;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAlternatemobnumber() {
        return alternatemobnumber;
    }

    public void setAlternatemobnumber(String alternatemobnumber) {
        this.alternatemobnumber = alternatemobnumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Employee(Long id, String name, Integer age, String gender, String mobilenumber, String alternatemobnumber, String salary, String emailid) {
        Id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobilenumber = mobilenumber;
        this.alternatemobnumber = alternatemobnumber;
        this.salary = salary;
        this.emailid = emailid;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", alternatemobnumber='" + alternatemobnumber + '\'' +
                ", salary='" + salary + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }
}
