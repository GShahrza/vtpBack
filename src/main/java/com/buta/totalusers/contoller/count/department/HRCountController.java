package com.buta.totalusers.contoller.count.department;

import com.buta.totalusers.data.countData.department.HRCount;
import com.buta.totalusers.service.count.department.HRCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HRCountController {
    @Autowired
    private HRCountService service;

    @GetMapping(value = "/hrcount")
    public HRCount getHrCount(){
        return service.getHrCount();
    }
}
