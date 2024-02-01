package com.request.validation.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private int userId;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Email (message = "Email format invalid")
    private String email;

    @NotBlank(message = "Phone number must not be blank")
    @Pattern(regexp = "\\d{10}", message = "Invalid phone number format")
    private String  mobile;

    private String gender;

    @Min(value = 18, message = "Age must be at least {value}")
    @Max(value = 60, message = "Age must not exceed {value}")
    private Integer age;

    @NotBlank(message = "Nationality must not be blank")
    private String nationality;

}
