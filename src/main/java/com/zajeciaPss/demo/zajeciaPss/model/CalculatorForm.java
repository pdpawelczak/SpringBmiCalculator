package com.zajeciaPss.demo.zajeciaPss.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CalculatorForm {
    //komentarz
    @NotNull(message="is required")
    @Min(value = 1, message = "must be gearter than or equal to 1")
    @Max(value = 3, message = "must be less than or equal to 3")
    private double height;

    @NotNull(message="is required")
    @Min(value = 1, message = "must be gearter than or equal to 1")
    @Max(value = 500, message = "must be less than or equal to 500")
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
