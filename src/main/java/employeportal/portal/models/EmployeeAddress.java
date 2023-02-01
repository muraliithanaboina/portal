package employeportal.portal.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class EmployeeAddress {
    @Id
    @GeneratedValue
    private  Long Id;
    @NotBlank
    private  String Empid;
    @NotBlank
    private String addresstype;
    private String address;
    @NotBlank
    private String city;
    private String state;
    @NotBlank
    private String pincode;
    private String country;
}
