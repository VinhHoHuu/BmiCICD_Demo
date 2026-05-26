package com.aVinh.health;

import com.aVinh.health.core.BmiCalculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiCalculator bmiCalculator = new BmiCalculator();

        System.out.println(bmiCalculator.getBmi(70, 1.75));
    }
}