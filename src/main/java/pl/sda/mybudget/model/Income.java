package pl.sda.mybudget.model;


import enumeration.IncomeType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class Income {

    private long amountInPolishGrosz;
    private LocalDateTime incomeDate;
    private String incomeSource;
    private IncomeType incomeType;



}
