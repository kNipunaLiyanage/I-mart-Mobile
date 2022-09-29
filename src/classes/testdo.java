/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static JframesSubs.AddNEWINVOICE.round;

/**
 *
 * @author Nipuna
 */
public class testdo {

    public static void main(String[] args) {
        double fff = round(200, 2);

        double input = 3.14159265359;
        String hh = String.format("%.2f", fff);
        System.out.println(hh);
    }
}
