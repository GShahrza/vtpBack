package com.buta.totalusers.data.compareData.degree;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class DegreeCompare {
    private double graduatePercent;
    private double bachelorPercent;
    private double masterPercent;
    private double doctoratePercent;
}
