package com.zajeciaPss.demo.zajeciaPss.controller;

import com.zajeciaPss.demo.zajeciaPss.model.CalculatorForm;
import com.zajeciaPss.demo.zajeciaPss.service.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    CalculatorServiceImpl calculatorService;


    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        CalculatorForm calculator = new CalculatorForm();
        theModel.addAttribute("calculator", calculator);

        return "calculator-form";
    }

    @RequestMapping("processForm")
    public String processForm(Model model, @Valid @ModelAttribute("calculator") CalculatorForm calculatorForm,
                              BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "calculator-form";
        }else{
            model.addAttribute("bmi", calculatorService.calculateBmi(calculatorForm));
            return "calculator-confirmation";
        }

    }
}
