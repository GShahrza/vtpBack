package com.buta.totalusers.service.departments;

import com.buta.totalusers.data.deparments.DepartmentsUser;
import com.buta.totalusers.repository.departments.HRDepartmentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HRDepartmentUserService {
    @Autowired
    private HRDepartmentUserRepository hrDepartmentUserRepository;
    @Autowired
    private DepartmentsUser dpUser;

    public List<DepartmentsUser> getHrUsers() {
        return changeObject(hrDepartmentUserRepository.findHRUsers());
    }
    private List<DepartmentsUser> changeObject(List<String> list) {
        List<DepartmentsUser> userList = list.stream().map(e -> convertToObject(e))
                .collect(Collectors.toList());
        return userList;
    }
    private DepartmentsUser convertToObject(String element) {
        String[] tokens = element.split(",");
        return dpUser.builder()
                .ages(Integer.valueOf(tokens[0]))
                .names(tokens[1])
                .surname(tokens[2])
                .email(tokens[3])
                .phone(tokens[4])
                .genderName(tokens[5])
                .universityNames(tokens[6])
                .degreeNames(tokens[7])
                .build();
    }
}
