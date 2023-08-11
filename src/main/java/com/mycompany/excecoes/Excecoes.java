/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excecoes;

/**
 *
 * @author Rafael
 */
public class Excecoes {

    public static void main(String[] args) {
         int resultado =0;
         divClass div = new divClass();
        try {
             resultado = div.dividir();
            System.out.println("resutlado : " + resultado );
        }
        catch(ArithmeticException e){        
         System.out.println( e.getMessage() );
        }
    }
    }

