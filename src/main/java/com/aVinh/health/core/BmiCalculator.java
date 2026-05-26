package com.aVinh.health.core;

public class BmiCalculator {
    //ham static tính BMI
    //bmi = cân nặng (kg) / (chiều cao (m))^2
    //bmi < 18.5: thiếu cân
    //18.5 <= bmi < 25: bình thường
    //25 <= bmi < 30: thừa cân
    //bmi >= 30: béo phì
    public double getBmi(double weight, double height) {
        return weight / (height * height);
    }
}
