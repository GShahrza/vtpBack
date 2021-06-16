package com.buta.totalusers.contoller.departments;

import com.buta.totalusers.data.deparments.DepartmentsUser;
import com.buta.totalusers.service.departments.ItDepartmentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ItDepartmentUserController {
    @Autowired
    private ItDepartmentUserService service;
    @GetMapping("/itusers")
    public List<DepartmentsUser> getItUsers(){
        return service.getItUsers();
    }
}
