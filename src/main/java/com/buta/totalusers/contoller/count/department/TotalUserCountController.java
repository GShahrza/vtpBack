package com.buta.totalusers.contoller.count.department;

import com.buta.totalusers.data.countData.department.TotalUserCount;
import com.buta.totalusers.service.count.department.TotalUserCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TotalUserCountController {
    @Autowired
    private TotalUserCountService service;

    @GetMapping("/totalcount")
    public TotalUserCount getTotalCount(){
        return service.getTotalCount();
    }
}
