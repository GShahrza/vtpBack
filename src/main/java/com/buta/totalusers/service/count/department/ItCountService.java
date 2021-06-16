package com.buta.totalusers.service.count.department;

import com.buta.totalusers.data.countData.department.ItCount;
import com.buta.totalusers.repository.count.department.ItCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItCountService {
    @Autowired
    private ItCountRepository repository;
    @Autowired
    private ItCount itCount;
    public ItCount getItCount(){

        changeObject(repository.findItCount());
        return itCount;
    }

    public void changeObject(Integer integer){
        this.itCount.setCount(integer);
    }
}
