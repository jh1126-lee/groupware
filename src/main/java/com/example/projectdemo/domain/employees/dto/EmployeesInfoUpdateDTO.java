package com.example.projectdemo.domain.employees.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesInfoUpdateDTO {
    private String empNum;
    private String phone;
    private String email;
    private String profileImgUrl;
}
