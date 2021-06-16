package com.buta.totalusers.service.compare.gender;

import com.buta.totalusers.data.compareData.gender.GenderCompare;
import com.buta.totalusers.repository.compare.gender.FemaleCountRepository;
import com.buta.totalusers.repository.compare.gender.MaleCountRepository;
import com.buta.totalusers.repository.compare.gender.OtherCountRepository;
import com.buta.totalusers.repository.count.department.TotalUserCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderCompareService {
    @Autowired
    private MaleCountRepository repository;
    @Autowired
    private FemaleCountRepository femaleCountRepository;
    @Autowired
    private OtherCountRepository otherCountRepository;
    @Autowired
    private GenderCompare count;
    @Autowired
    TotalUserCountRepository totalUserCountRepository;
    public GenderCompare getGenderPercantage(){
        changeObject(repository.findMaleUsers(),
                femaleCountRepository.findFemaleUsers(),
                otherCountRepository.findOtherUsers());
        return count;
    }

    public  void changeObject(Integer male,Integer female,Integer other){
       int allUsers= totalUserCountRepository.findTotalUserCount();
       count.setFemalePercent(round(female*100/(double)allUsers,1));
       count.setMalePercent(round(male*100/(double)allUsers,1));
       count.setOtherPercent(round(other*100/(double)allUsers,1));
    }
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
