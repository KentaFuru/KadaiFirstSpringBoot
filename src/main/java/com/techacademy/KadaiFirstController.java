package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{dt}")
    public String dispDayOfWeek(@PathVariable String dt) {
        LocalDate ld = LocalDate.of(Integer.parseInt(dt.substring(0, 4)), Integer.parseInt(dt.substring(4, 6)), Integer.parseInt(dt.substring(6, 8)));
        DayOfWeek w = ld.getDayOfWeek();
        return w.toString();
    }

    @GetMapping("/plus/{num1}/{num2}")
    public int calcPlus(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/minus/{num1}/{num2}")
    public int calcMinus(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    @GetMapping("/times/{num1}/{num2}")
    public int calcTimes(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public String calcDivide(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            return "0で割ることはできません";
        }
        return String.valueOf(num1 / num2);
    }


}
