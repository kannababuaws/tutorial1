package com.pujari.demopractice.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
@NotBlank(message = "first name is required.")
    private String firstName;
    @NotBlank(message = "last name is required.")
    private String lastName;
    @NotBlank(message = "Email id is required.")
    @Email(message = "the email is invalid.")
    private String email;
    @NotNull(message = "At least one phone number has required.")
    private String phoneNumber;
    private LocalDate dateOfJoining;
    private int salary;
}
