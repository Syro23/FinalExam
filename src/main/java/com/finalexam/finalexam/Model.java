/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finalexam.finalexam;

/**
 *
 * @author informatica
 */
public class Model {
    private String name = "";
    private String author = "";
    private String category = "";
    private boolean available = true;
    
    public Model(String name, String author, String category, boolean available){
        this.name = name;
        this.author = author;
        this.category = category;
        this.available = available;
    }
    
    public String toString(){
        return getName() + "" + getAuthor() + "" + getCategory() + "" + isAvailable();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
    
    
    
    
    
}
