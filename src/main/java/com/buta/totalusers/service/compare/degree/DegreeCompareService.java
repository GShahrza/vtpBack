package com.buta.totalusers.service.compare.degree;

import com.buta.totalusers.data.compareData.degree.DegreeCompare;
import com.buta.totalusers.repository.compare.degree.BachelorsCountRepository;
import com.buta.totalusers.repository.compare.degree.DoctorateCountRepository;
import com.buta.totalusers.repository.compare.degree.GraduateCountRepository;
import com.buta.totalusers.repository.compare.degree.MasterCountRepository;
import com.buta.totalusers.repository.count.department.TotalUserCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DegreeCompareService {
    @Autowired
    private GraduateCountRepository graduateCountRepository;
    @Autowired
    private BachelorsCountRepository bachelorsCountRepository;
    @Autowired
    private MasterCountRepository masterCountRepository;
    @Autowired
    private DoctorateCountRepository doctorateCountRepository;
    @Autowired
    private TotalUserCountRepository totalUserCountRepository;
    @Autowired
    private DegreeCompare degreeCompare;

    public DegreeCompare getDegreePercentage(){
         changeObjects(graduateCountRepository.findGraduateusers(),
                bachelorsCountRepository.findBachelorsUsers(),
                masterCountRepository.findMasterusers(),
                doctorateCountRepository.findDoctorateUsers()
                );
         return degreeCompare;
    }

    private void changeObjects(Integer graduate,Integer bachelors,Integer master,Integer doctorate){
        int allUser = totalUserCountRepository.findTotalUserCount();
        degreeCompare.setGraduatePercent(round(graduate * 100 / (double)allUser,1));
        degreeCompare.setBachelorPercent(round(bachelors* 100 / (double)allUser,1));
        degreeCompare.setMasterPercent(round(master * 100 / (double)allUser,1));
        degreeCompare.setDoctoratePercent(round(doctorate * 100 / (double)allUser,1));
    }
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
