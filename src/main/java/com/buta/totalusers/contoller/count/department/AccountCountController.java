package com.buta.totalusers.contoller.count.department;

import com.buta.totalusers.data.countData.department.AccountCount;
import com.buta.totalusers.service.count.department.AccountCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AccountCountController {
    @Autowired
    private AccountCountService service;

    @GetMapping(value = "/accountcount")
    public AccountCount getAccountingCount(){
        return service.getAccountingCount();
    }

}
