/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Angel Vargas
 */
public class LibroController {
    
    Libro[] tablaLibro;
    int indiceArray;

    /*es un metodo constructor*/
    public LibroController(){
        this.tablaLibro = new Libro[100];
        this.indiceArray=0;
    }
    
     public void guardarLibro(Libro libro){
        this.tablaLibro[this.indiceArray]=libro;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Libro[] getLibros(){
        return this.tablaLibro;
    }
    
}

