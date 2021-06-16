package com.buta.totalusers.contoller.count.universities;

import com.buta.totalusers.data.countData.universitites.UniversityCount;
import com.buta.totalusers.service.count.universities.UniversityCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UniversityCounController {
    @Autowired
    private UniversityCountService universityCountService;

    @GetMapping(value="universitycount")
    public UniversityCount getUniversityCount(){
        return universityCountService.getUniversityCount();
    }
}
