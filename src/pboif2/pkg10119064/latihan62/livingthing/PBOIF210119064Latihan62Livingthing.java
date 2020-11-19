/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan62.livingthing;

import model.Human;

/**
 *
 * @author Bagus_24
 */
public class PBOIF210119064Latihan62Livingthing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human human = new Human();
        human.setNama("Bagus Budi Wibowo");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
