/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program Living Thing
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}
