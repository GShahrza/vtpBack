package com.buta.totalusers.service.count.ages;

import com.buta.totalusers.data.countData.ages.AgesCount;
import com.buta.totalusers.repository.count.ages.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgesCountService {
    @Autowired
    private EighteenCountRepository eighteenCountRepository;
    @Autowired
    private NineteenCountRepository nineteenCountRepository;
    @Autowired
    private TwentyCountRepository twentyCountRepository;
    @Autowired
    private TwentyOneCountRepository twentyOneCountRepository;
    @Autowired
    private TwentyTwoCountReposiotry twentyTwoCountReposiotry;
    @Autowired
    private TwentyThreeCountRepository twentyThreeCountRepository;
    @Autowired
    private TwentyFourCountRepository twentyFourCountRepository;
    @Autowired
    private AgesCount agesCount;

    public AgesCount getAgesCount(){
        changeObject(eighteenCountRepository.findEighteenCount(),
                nineteenCountRepository.findNineteenCount(),
                twentyCountRepository.findTwentyCount(),
                twentyOneCountRepository.findTwentyOneCount(),
                twentyTwoCountReposiotry.findTwentyTwoCount(),
                twentyThreeCountRepository.findTwentyThreeCount(),
                twentyFourCountRepository.findTwentyFourCount()
                );
        return agesCount;
    }
    private void changeObject(Integer eighteen,Integer nineteen,Integer twenty,Integer twentyOne,Integer twentyTwo,Integer twentyThree,Integer twentyFour){
        agesCount.setEighteen(eighteen);
        agesCount.setNineteen(nineteen);
        agesCount.setTwenty(twenty);
        agesCount.setTwentyOne(twentyOne);
        agesCount.setTwentyTwo(twentyTwo);
        agesCount.setTwentyThree(twentyThree);
        agesCount.setTwentyFour(twentyFour);

    }
}
