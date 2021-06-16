package com.buta.totalusers.contoller.count.ages;

import com.buta.totalusers.data.countData.ages.AgesCount;
import com.buta.totalusers.service.count.ages.AgesCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AgesCountController {
    @Autowired
    private AgesCountService agesCountService;

    @GetMapping(value = "agescount")
    public AgesCount countAges(){
        return agesCountService.getAgesCount();
    }
}
