package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;

import com.sun.tools.javac.Main;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Posicion;
import org.iesalandalus.programacion.utilidades.Entrada;


public class MainApp {
    private static Dama dama;
    private Consola consola;
    private Direccion direccion;

    public MainApp() {
        dama = null;
        consola = new Consola();
    }

    // Utilizamos un switch para ejecutar la opción seleccionada en el menú
    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearDamaDefecto();
                break;
            case 2:
                crearDamaColor();
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
                break;
        }
    }

    private static void mover() {
    }
    private static void crearDamaColor() {
    }
    private static void crearDamaDefecto() {
    }



}
