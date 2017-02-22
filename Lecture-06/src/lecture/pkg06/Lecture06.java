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
public class Lecture06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ICalculator hpCalc = new HPCalculator();
        double number1 = 5;
        double number2 = 3;

        double hpResult = hpCalc.add(number1, number2);

        System.out.println(hpResult);

        ICalculator texasCalc = new TexasCalculator();
        double texasResult = texasCalc.add(number1, number2);

        if (hpResult != texasResult) {
            throw new Exception();
        }

        System.out.println(texasResult);
    }

}
