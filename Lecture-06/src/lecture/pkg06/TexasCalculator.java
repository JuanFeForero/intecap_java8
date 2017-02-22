/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg06;

/**
 *
 * @author Cesar
 */
public class TexasCalculator implements ICalculator{

    @Override
    public double add(double number1, double number2) {
        System.out.println("Sumando al estilo Texas instruments");
        return number1 + number2;
    }

    @Override
    public double substract(double number1, double number2) {
        System.out.println("restando al estilo Texas instruments");
        return number1 - number2;
    }

    @Override
    public double divide(double number1, double number2) {
        System.out.println("Dividiendo al estilo Texas instruments");
        return number1 / number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        System.out.println("Multiplicando al estilo Texas instruments");
        return number1 * number2;
    }
    
}
