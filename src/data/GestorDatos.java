/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Tour;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GestorDatos {

    public ArrayList<Tour> toursDisponibles(String rutaArchivo) {
        ArrayList<Tour> lista = new ArrayList<>();
        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                String[] partes = linea.split(";");

                if (partes.length == 4) {
                    String lugar = partes[0];
                    double precio = Double.parseDouble(partes[1]);
                    int cupos = Integer.parseInt(partes[2]);
                    String guia = partes[3];

                    lista.add(new Tour(lugar, precio, cupos, guia));

                }

            }
            lector.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return lista;

    }
}
