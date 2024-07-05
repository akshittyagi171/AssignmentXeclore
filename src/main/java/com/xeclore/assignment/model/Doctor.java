package com.xeclore.assignment.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Doctor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3)
    private String name;

    @NotBlank
    @Pattern(regexp = "Delhi|Noida|Faridabad")
    private String city;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 10)
    private String phone;

    @NotBlank
    @Pattern(regexp = "Orthopaedic|Gynecology|Dermatology|ENT")
    private String speciality;

}

