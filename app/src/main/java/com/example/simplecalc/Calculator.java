package com.example.simplecalc;

public class Calculator {



    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL,GIAITHUA1,POW,LOGARIT}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand,secondOperand);
    }

    public double giaithua1(double firstOperand) {
        long fact = 1;
        for(int i = 1; i <= firstOperand; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public double logarit(double firstOperand, double secondOperand) {
        return Math.log(secondOperand)/Math.log(firstOperand);
    }
}
