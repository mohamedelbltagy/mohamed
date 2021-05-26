/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication25;

import java.util.Arrays;

/**
 *
 * @author carnival
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                String str = "172.137.11.66";
        String[] arrOfStr = str.split("\\.");
  
        for (int i=0;i<4;i++)
            System.out.println(arrOfStr[i]);
        // TODO code application logic here
    }
    
}
