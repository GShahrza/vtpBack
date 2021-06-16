package com.buta.totalusers.data.deparments;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentsUser {

    private String names;
    private String surname;
    private int ages;
    private String email;
    private String phone;
    private String genderName;
    private String universityNames;
    private String degreeNames;
}
