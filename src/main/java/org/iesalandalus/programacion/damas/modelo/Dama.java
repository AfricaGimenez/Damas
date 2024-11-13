package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    private Color color;
    private Posición posicion;
    private Boolean esDamaEspecial;

    // Constructor por defecto que crea una dama blanca en una posición válida aleatoria
    public Dama() {
        this.color = Color.BLANCO;
        this.posicion = generarPosicionAleatoria();
        this.esDamaEspecial = false;
    }


    // Constructor con parámetros
    public Dama(Color color, Posición posicion, Boolean esDamaEspecial) {
        this.setColor(color);
        this.setPosicion(posicion);
        this.setEsDamaEspecial(esDamaEspecial);
    }

    // Getter y Setter para color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo.");
        }
        this.color = color;
    }

    // Getter y Setter para posicion
    public Posición getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula.");
        }
        this.posicion = posicion;
    }

    // Getter y Setter para esDamaEspecial
    public Boolean getEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(Boolean esDamaEspecial) {
        if (esDamaEspecial == null) {
            throw new IllegalArgumentException("El atributo 'esDamaEspecial' no puede ser nulo.");
        }
        this.esDamaEspecial = esDamaEspecial;
    }
}
    // Metodo privado para generar una posición aleatoria en las filas 1, 2 o 3 en una casilla negra
    private Posición generarPosicionAleatoria() {
    Random random = new Random();
    int fila = random.nextInt(3) + 1; // Filas 1, 2, o 3
    int columna;

    if (fila % 2 == 1) { // Filas 1 y 3 (impares): casillas negras en columnas pares
        columna = 2 * (random.nextInt(4) + 1); // Columnas posibles: 2, 4, 6, 8
    } else { // Fila 2 (par): casillas negras en columnas impares
        columna = 2 * random.nextInt(4) + 1; // Columnas posibles: 1, 3, 5, 7
    }

    return new Posición(fila, columna);
    }
    }
}
