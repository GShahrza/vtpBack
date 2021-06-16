package com.buta.totalusers.service.count.department;

import com.buta.totalusers.data.countData.department.TotalUserCount;
import com.buta.totalusers.repository.count.department.TotalUserCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalUserCountService {
    @Autowired
    private TotalUserCountRepository repository;
    @Autowired
    private TotalUserCount totalUserCount;
    public TotalUserCount getTotalCount(){
        changeObject(repository.findTotalUserCount());
        return totalUserCount;
    }

    public void changeObject(Integer integer){
        this.totalUserCount.setCount(integer);
    }
}
