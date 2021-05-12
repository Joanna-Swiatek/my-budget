package pl.sda.mybudget.controller.rest;


import enumeration.IncomeType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.mybudget.model.Income;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rest/incomes")
public class IncomeRestController {

    @GetMapping("/")
    List<Object> getAllIncomes(){
        return List.of(
                new Income(1_000, LocalDateTime.now(), "od żony", IncomeType.MOPS),
                new Income(2_000, LocalDateTime.now(), "od MOPS-u", IncomeType.MOPS)

                );
    }

}
