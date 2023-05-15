/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finalexam.finalexam;

import java.util.ArrayList;

/**
 *
 * @author informatica
 * @param <K>
 */
public class Controller<K> {
    private ArrayList<Model> books;
    
    public Controller(){
    
    }
    
    public void reserveBook(Model book){
        book.setAvailable(false);
    }
    
    public Model searchBook(K value){
        Model book = null;
        for (Model book1 : books) {
            if(value == book1.getAuthor() || value == book1.getCategory() || value == book1.getName()){
                book = book1;
            }
            else{
                System.out.println("We don't have the book you are searching for");
            }
        }
        return book;
    }
    
    public boolean checkAvailability(Model book){
        return book.isAvailable();
    }
    
}
