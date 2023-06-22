package com.geekster.UserManagement.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private Integer userId;
    @NotBlank(message = "name cannot be blank")
    private String userName;
    //@Email
    //@Pattern(regexp = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.geekster\\.com", message = "email should end with geekster.com")
    private String userEmail;
    private String password;
    @Pattern(regexp = "\\d{10}")
    private String userContact;

    @Min(value = 18)
    @Max(value = 30)
    private Integer userAge;
    private LocalDate userDOB;//EX : 2007-12-03.
    private Type userType;

}
