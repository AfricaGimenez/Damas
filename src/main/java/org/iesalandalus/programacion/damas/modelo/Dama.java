package org.iesalandalus.programacion.damas.modelo;

import java.util.Random;

public class Dama {
    private Color color;
    private Posicion posicion;
    private Boolean esDamaEspecial;

    // Constructor por defecto que crea una dama blanca en una posición válida aleatoria
    public Dama() {
        this.color = Color.BLANCO;
        this.posicion = generarPosicionAleatoria();
        this.esDamaEspecial = false;
    }

    // Constructor con parámetros
    public Dama(Color color, Posicion posicion, Boolean esDamaEspecial) {
        this.setColor(color); // Usamos el setter para validar el color
        this.setPosicion(posicion); // Usamos el setter para validar la posición
        this.setEsDamaEspecial(esDamaEspecial); // Usamos el setter para validar este atributo
    }

    // Constructor que inicializa color y posición (elimina el atributo esDamaEspecial)
    public Dama(Color color, Posicion posicion) {
        this(color, posicion, false); // Reutiliza el constructor completo
    }

    // Métodos getter y setter
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula.");
        }
        this.posicion = posicion;
    }

    public Boolean getEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(Boolean esDamaEspecial) {
        if (esDamaEspecial == null) {
            throw new IllegalArgumentException("El atributo 'esDamaEspecial' no puede ser nulo.");
        }
        this.esDamaEspecial = esDamaEspecial;
    }

    // Método privado para generar una posición aleatoria en las filas 1, 2 o 3 en una casilla negra
    private Posicion generarPosicionAleatoria() {
        Random random = new Random();
        int fila = random.nextInt(3) + 1; // Filas 1, 2, o 3
        int columna;

        if (fila % 2 == 1) { // Filas 1 y 3 (impares): casillas negras en columnas pares
            columna = 2 * (random.nextInt(4) + 1); // Columnas posibles: 2, 4, 6, 8
        } else { // Fila 2 (par): casillas negras en columnas impares
            columna = 2 * random.nextInt(4) + 1; // Columnas posibles: 1, 3, 5, 7
        }

        return new Posicion (fila, (char) ('A' + columna - 1)); // Ajuste para convertir a columna tipo carácter
    }

    // Método público para generar una posición inicial de manera aleatoria
    public static Posicion crearPosicionInicial() {
        Random random = new Random();
        int fila = random.nextInt(3) + 1; // Filas 1, 2, o 3
        int columna;

        if (fila % 2 == 1) { // Filas 1 y 3 (impares): casillas negras en columnas pares
            columna = 2 * (random.nextInt(4) + 1); // Columnas posibles: 2, 4, 6, 8
        } else { // Fila 2 (par): casillas negras en columnas impares
            columna = 2 * random.nextInt(4) + 1; // Columnas posibles: 1, 3, 5, 7
        }

        return new Posicion(fila, (char) ('A' + columna - 1)); // Ajuste para convertir a columna tipo carácter
    }

    @Override
    public String toString() {
        return "Dama{" +
                "posicion=" + posicion +
                ", color=" + color +
                ", esDamaEspecial=" + esDamaEspecial +
                '}';
    }
}
