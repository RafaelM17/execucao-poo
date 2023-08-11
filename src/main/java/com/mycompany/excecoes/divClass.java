/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excecoes;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class divClass {
   public static int dividir() {
       Scanner scanner = new Scanner(System.in);
      
       System.out.print("Digite um número : ");
      int a = scanner.nextInt();
      System.out.print("Digite outro número : ");
      int b = scanner.nextInt();
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida "  );
        }
        return a / b;
    }
}
