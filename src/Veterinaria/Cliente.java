/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

/**
 *
 * @author josi2
 */
public class Cliente {
    private String Identificación;
    private String Nombre;
    private String Teléfono;

    public Cliente(String Identificación, String Nombre, String Teléfono) {
        this.Identificación = Identificación;
        this.Nombre = Nombre;
        this.Teléfono = Teléfono;
    }
    
    public String getIdentificación() {
        return Identificación;
    }

    public void setIdentificación(String Identificación) {
        this.Identificación = Identificación;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }
}
