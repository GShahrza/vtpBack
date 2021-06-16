package com.buta.totalusers.contoller.departments;

import com.buta.totalusers.data.deparments.DepartmentsUser;
import com.buta.totalusers.service.departments.LogisticDepartmentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class LogisticDepartmentUserController {
    @Autowired
    private LogisticDepartmentUserService logisticDepartmentUserService;

    @GetMapping(value = "logisticusers")
    public List<DepartmentsUser> getLogisticUsers(){
        return logisticDepartmentUserService.getLogisticUsers();
    }
}
