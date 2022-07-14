package com.cluz.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private static final Long SerialVersionUID = 1L;
    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal(){
        return dailyIncome * days;
    }
}
