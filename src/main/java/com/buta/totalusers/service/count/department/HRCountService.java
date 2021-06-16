package com.buta.totalusers.service.count.department;

import com.buta.totalusers.data.countData.department.HRCount;
import com.buta.totalusers.repository.count.department.HRCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRCountService {
    @Autowired
    private HRCountRepository repository;
    @Autowired
    private HRCount hrCount;
    public HRCount getHrCount(){
        changeObject(repository.findHRCount());
        return hrCount;
    }

    public void changeObject(Integer integer){
        this.hrCount.setCount(integer);
    }
}
