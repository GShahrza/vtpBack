package com.buta.totalusers.contoller.compare.degree;

import com.buta.totalusers.data.compareData.degree.DegreeCompare;
import com.buta.totalusers.service.compare.degree.DegreeCompareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DegreePercentController {
    @Autowired
    private DegreeCompareService degreeCompareService;

    @GetMapping(value = "degreepercent")
    public DegreeCompare compareDegree(){
        return degreeCompareService.getDegreePercentage();
    }
}
