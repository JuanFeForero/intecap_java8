/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg04;

import co.edu.intecap.lecture04.constants.EColors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cesar
 */
public class Lecture04 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.println("Digite su color favorito:");
        EColors color = EColors.valueOf(reader.readLine());

        switch (color) {
            case RED:
                System.out.println("Eligio el color rojo!");
                break;
            case GREEN:
                System.out.println("Eligio el color verde!");
                break;
            case BLUE:
                System.out.println("Eligio el color azul!");
                break;
            default : System.out.println("no escogio nada");
        }
    }

}
