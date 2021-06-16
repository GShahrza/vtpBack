package com.buta.totalusers.contoller.compare.gender;

import com.buta.totalusers.data.compareData.gender.GenderCompare;
import com.buta.totalusers.service.compare.gender.GenderCompareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GenderPercentController {
    @Autowired
    private GenderCompareService service;
    @GetMapping(value = "/genderpercent")
    public GenderCompare compareGender(){
        return service.getGenderPercantage();
    }
}
