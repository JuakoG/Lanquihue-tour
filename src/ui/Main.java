package ui;

import data.GestorDatos;

import java.util.ArrayList;

import model.Tour;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.toursDisponibles("resources/tours.txt");

        System.out.println("   Tours Disponibles  ");
        // muestra todo
        for (Tour td : tours) {
            System.out.println(td.toString());

        }
        System.out.println("Filtra por cupo");
        // filtra por cupo
        for (Tour td : tours) {

            if (td.getCupos() > 20)
                System.out.println(td);

        }

        System.out.println("precio barato");

        for (Tour td : tours) {
            if (td.getPrecio() <= 15000) {
                System.out.println(td);
            }


        }
    }

}
