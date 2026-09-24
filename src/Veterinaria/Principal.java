/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

/**
 *
 * @author josi2
 */
public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("1111", "Gerardo", "3333333333");
        Mascota mascota1 = new Mascota("Bruno", "Perro", 5, 25, cliente1);
        Mascota mascota2 = new Mascota("Lola", "Gata", 1, 10);
        
        mascota1.mostrarResumen();
        System.out.println("============");
        mascota2.mostrarResumen();
        System.out.println("Dueño: " + mascota1.getDuenio().getNombre());
        System.out.println("=============");
    }
            
}
