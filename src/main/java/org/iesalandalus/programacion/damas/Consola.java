package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    public Consola() {
    }

    // Metodo para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Crea una dama por defecto");
        System.out.println("2. Crea una dama eligiendo el color");
        System.out.println("3. Mover la dama");
        System.out.println("4. Salir");
    }

    // Metodo para elegir una opción del menú
    public static int elegirOpcionMenu() {
        int opcion;
        do{
            System.out.println("Escoge entre las opciones (1 - 4)");
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    // Metodo para elegir un color
    public static Color elegirColor() {
        Color color = null;
        while (color == null) {
            System.out.println("Seleccione el color (1: Blanco, 2: Negro):");
            int opcion = Entrada.entero();
            if (opcion == 1) {
                color = Color.BLANCO;
            } else if (opcion == 2) {
                color = Color.NEGRO;
            } else {
                System.out.println("Opción no válida, por favor elija 1 o 2.");
            }
        }
        return color;
    }

    public static Direccion elegirDirección(){
        int mover;
        do {
            System.out.println("Elige una dirección (1 - 4): ");
            mover = Entrada.entero();
        } while (mover < 1 || mover > 4);
        Direccion direccion = null;
        switch (mover){
            case 1:
                return Direccion.NOROESTE;
            case 2:
                return Direccion.NORESTE;
            case 3:
                return Direccion.SURESTE;
            case 4:
                return Direccion.SUROESTE;
        }
        if (mover < 1 || mover > 4){
            throw new IllegalArgumentException("Solo puedes elegir entre esas 4 opciones");
        }
        return direccion;
    }

    public static void mostrarMenuDirecciones(){
        System.out.println("Selecciona una dirección: ");
        System.out.println("1.Noroeste");
        System.out.println("2.Noreste");
        System.out.println("3.Sureste");
        System.out.println("4.Suroeste");
    }

    public static int elegirPasos() {
        int pasos = 0;
        System.out.println("Introduzca el número de pasos (mínimo 1): ");
        pasos = Entrada.entero();
        if (pasos < 1){
            System.out.println("Como mínimo tienes que dar un paso");
        }
        return pasos;
    }


}
