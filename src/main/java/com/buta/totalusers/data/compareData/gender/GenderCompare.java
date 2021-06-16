package com.buta.totalusers.data.compareData.gender;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class GenderCompare {
    private double malePercent;
    private double femalePercent;
    private double otherPercent;
}
