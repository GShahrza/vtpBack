package com.buta.totalusers.service.count.universities;

import com.buta.totalusers.data.countData.universitites.UniversityCount;
import com.buta.totalusers.repository.count.universities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityCountService {
    @Autowired
    private UnecCountRepository unecCountRepository;
    @Autowired
    private BduCountRepository bduCountRepository;
    @Autowired
    private BmuCountRepository bmuCountRepository;
    @Autowired
    private AdaCountRepository adaCountRepository;
    @Autowired
    private AdnsuCountRepository adnsuCountRepository;
    @Autowired
    private KhazarCountRepository khazarCountRepository;
    @Autowired
    private UfazCountRepository ufazCountRepository;
    @Autowired
    private UniversityCount count;

    public UniversityCount getUniversityCount(){
        changeObject(
                unecCountRepository.findUnecCount(),
                bduCountRepository.findBduCount(),
                bmuCountRepository.findBmuCount(),
                adaCountRepository.findAdaCount(),
                adnsuCountRepository.findAdnsuCount(),
                khazarCountRepository.findKhazarCount(),
                ufazCountRepository.findUfazCount()
                );
        return count;
    }

    private void changeObject(Integer unec,Integer bdu,Integer bmu,Integer ada,Integer adnsu,Integer khazar,Integer ufaz){
        count = UniversityCount.builder()
                .ada(ada)
                .adnsu(adnsu)
                .bdu(bdu)
                .bmu(bmu)
                .unec(unec)
                .khazar(khazar)
                .ufaz(ufaz)
                .build();
    }
}
