package com.buta.totalusers.data.countData.universitites;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Component
public class UniversityCount {
    private int unec;
    private int bdu;
    private int bmu;
    private int adnsu;
    private int ada;
    private int khazar;
    private int ufaz;

}
