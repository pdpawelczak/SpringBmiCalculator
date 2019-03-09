package com.zajeciaPss.demo.zajeciaPss.service;

import com.zajeciaPss.demo.zajeciaPss.model.CalculatorForm;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double calculateBmi(CalculatorForm calculatorForm) {
        return (calculatorForm.getWeight()/(calculatorForm.getHeight()*calculatorForm.getHeight()));
    }
}
