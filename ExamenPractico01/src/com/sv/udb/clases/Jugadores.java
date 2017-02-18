/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author DanielWilfredo
 */
public class Jugadores {
    
    String nombJuga;
    int edad;
    double altu;
    double peso; 

    public String getNombJuga() {
        return nombJuga;
    }

    public void setNombJuga(String nombJuga) {
        this.nombJuga = nombJuga;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltu() {
        return altu;
    }

    public void setAltu(double altu) {
        this.altu = altu;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

       
    
    public ArrayList jugaTodo()
    {
        ArrayList<String> nombre = new ArrayList<String>();
         String nomb = getNombJuga();
             int edad = getEdad();
             Integer.toString(edad);
                 double altura = getAltu(); 
                 Double.toString(altura);
                     double peso = getPeso();
                     Double.toString(peso);
                     String juga2 = (nomb + "," + edad +","+ altura +","+ peso);
                 
          nombre.add(juga2);
       for(int x=0;x<nombre.size();x++) {
          System.out.println(nombre.get(x));
}         
          return nombre;
    }
    public ArrayList nombre()
    {
         ArrayList<String> nombre = new ArrayList<String>();
         String nomb = getNombJuga();
                            
          nombre.add(nomb);
        return nombre;
    }
    
     public ArrayList edad()
    {
         ArrayList<String> edad2 = new ArrayList<String>();
        
             String edad = Integer.toString(getEdad());
              edad2.add(edad);
          return edad2;
          
    }
       public ArrayList altura()
    {
         ArrayList<String> edad2 = new ArrayList<String>();
        
             String alt = Integer.toString(getEdad());
              edad2.add(alt);
          return edad2;
          
    }
         public ArrayList peso()
    {
         ArrayList<String> edad2 = new ArrayList<String>();
        
             String peso = Double.toString(getEdad());
              edad2.add(peso);
          return edad2;
          
    }
    
    
   
    
    
    
}
