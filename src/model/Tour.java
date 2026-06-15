/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Tour {
    private String lugar;
    private double precio;
    private int cupos;
    private String guia;

    public Tour() {
    }

    public Tour(String lugar, double precio, int cupos, String guia) {
        this.lugar = lugar;
        this.precio = precio;
        this.cupos = cupos;
        this.guia = guia;
    }
    
    
    

   

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour{" + "lugar=" + lugar + ", precio=" + precio + ", cupos=" + cupos + ", guia=" + guia + '}';
    }
    
    
    

}
 