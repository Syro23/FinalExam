/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.finalexam.finalexam;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class View {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner lectura = new Scanner(System.in);
        int salir = 1;
        while(salir == 1){
        System.out.println("Choose what you want to do ");
   
        System.out.println("A. Search for a book ");
        
        System.out.println("B. Reserve a book ");
        
        System.out.println("C. Purchase a book ");
        
        System.out.println("D. Return a book ");
        
        System.out.println("E. Salir");
        
        String resp = lectura.nextLine();
        resp = resp.toUpperCase();
        
        
            switch(resp){
                case "A" -> {
                   System.out.println("Which book are you going search: ");
                   Model book = controller.searchBook(lectura.nextLine());
                   System.out.println(book);
                }

                case "B" -> {
                    System.out.println("Which book are you going to reserve: ");
                    Model book = controller.searchBook(lectura.nextLine());
                    if(book != null && book.isAvailable() == true){
                        controller.reserveBook(book);
                        System.out.println("Your book was successfully reserved");
                    }
                    else{
                        System.out.println("The book is not available");
                    }
                }

                case "C" -> {
                    System.out.println("Which book are you going to purchase: ");
                    Model book = controller.searchBook(lectura.nextLine());
                    if(book != null && book.isAvailable() == true){
                        controller.reserveBook(book);
                        System.out.println("Your book was successfully purchased");
                    }
                    else{
                        System.out.println("The book is not available");
                    }
                    
                }

                case "D" -> {
                    System.out.println("Which book are you going to return: ");
                    Model book = controller.searchBook(lectura.nextLine());
                    book.setAvailable(true);
                    System.out.println("The book was successfully returned");
                }

                
                    
               
            }
            System.out.println("Desea salir? ");
            System.out.println("0. Si");
            System.out.println("1. No");
            salir = lectura.nextInt();
        }
        
    }    
}

