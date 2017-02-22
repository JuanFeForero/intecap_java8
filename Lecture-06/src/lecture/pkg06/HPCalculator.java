package lecture.pkg06;


import lecture.pkg06.ICalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cesar
 */
public class HPCalculator implements ICalculator{

    @Override
    public double add(double number1, double number2) {
        System.out.println("sumando al estilo HP");
        return number1 + number2;
    }

    @Override
    public double substract(double number1, double number2) {
        System.out.println("restando al estilo HP");
        return number1 - number2;
    }

    @Override
    public double divide(double number1, double number2) {
        System.out.println("dividiendo al estilo HP");
        return number1 / number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        System.out.println("multiplicando al estilo HP");
        return number1 * number2;
    }
    
}
