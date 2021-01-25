package de.stea1th.probeserver.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_employee")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Employee extends BaseEntity {


    @Column(name = "first_name")
    @Size(max = 100)
    @NotBlank
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 100)
    @NotBlank
    private String lastName;

    @Column(name = "email")
    @Email
    @Size(max = 100)
    @NotBlank
    private String email;
}
