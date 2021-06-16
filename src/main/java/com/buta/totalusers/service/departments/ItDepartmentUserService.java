package com.buta.totalusers.service.departments;

import com.buta.totalusers.data.deparments.DepartmentsUser;
import com.buta.totalusers.repository.departments.ItDepartmentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItDepartmentUserService {
    @Autowired
    private ItDepartmentUserRepository repository;
    @Autowired
    private DepartmentsUser dpuser;

    public List<DepartmentsUser> getItUsers() {
        return changeObject(repository.findItUsers());
    }

    private List<DepartmentsUser> changeObject(List<String> list) {
        List<DepartmentsUser> userList = list.stream().map(e -> convertToObject(e))
                .collect(Collectors.toList());
        return userList;
    }

    private DepartmentsUser convertToObject(String element) {
        String[] tokens = element.split(",");
        return dpuser.builder()
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
