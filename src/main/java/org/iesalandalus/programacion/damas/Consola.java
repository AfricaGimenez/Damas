package org.iesalandalus.programacion.damas;

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


}
