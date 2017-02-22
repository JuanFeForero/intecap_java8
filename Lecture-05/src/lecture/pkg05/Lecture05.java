/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg05;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Lecture05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = null;
        String text = null;
        try {
            text = sc.next();
        } catch (NullPointerException e) {
            System.out.println("El scanner esta nulo");
            sc = new Scanner(System.in);
            text = sc.next();
        } 
        finally {
            System.out.println(text);
        }

    }

}
