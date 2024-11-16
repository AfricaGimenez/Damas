package org.iesalandalus.programacion.damas.modelo;
import java.util.Random;
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

    public void setPosicion(Posición posicion) {
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

    return new Posición(fila, (char) columna);
    }

    public Dama(org.iesalandalus.programacion.damas.modelo.Color color, org.iesalandalus.programacion.damas.modelo.Posición posicion) {
        this.color = color;
        this.posicion = posicion;
    }
    // Metodo público para generar una posición inicial de manera aleatoria
    public static Posición crearPosicionInicial() {
        Random random = new Random();
        int fila = random.nextInt(3) + 1; // Filas 1, 2, o 3
        int columna;

        if (fila % 2 == 1) { // Filas 1 y 3 (impares): casillas negras en columnas pares
            columna = 2 * (random.nextInt(4) + 1); // Columnas posibles: 2, 4, 6, 8
        } else { // Fila 2 (par): casillas negras en columnas impares
            columna = 2 * random.nextInt(4) + 1; // Columnas posibles: 1, 3, 5, 7
        }

        return new Posición(fila, (char) columna);
    }

    // Metodo para mover la dama
    public void mover(Direccion direccion, int pasos) throws IllegalArgumentException {
        if (direccion == null) {
            throw new NullPointerException("La dirección no puede ser nula.");
        }

        if (pasos < 1) {
            throw new IllegalArgumentException("El número de pasos debe ser un valor positivo mayor o igual que 1.");
        }

        if (!esDamaEspecial && pasos != 1) {
            throw new IllegalArgumentException ("Una dama no especial solo puede moverse 1 casilla.");
        }

        // Calcular la nueva posición
        int nuevaFila = posicion.getFila();
        char nuevaColumna = posicion.getColumna();

        switch (direccion) {
            case NORESTE:
                nuevaFila += pasos;
                nuevaColumna += pasos;
                break;
            case NOROESTE:
                nuevaFila += pasos;
                nuevaColumna -= pasos;
                break;
            case SURESTE:
                nuevaFila -= pasos;
                nuevaColumna += pasos;
                break;
            case SUROESTE:
                nuevaFila -= pasos;
                nuevaColumna -= pasos;
                break;
            default:
                throw new IllegalArgumentException ("Dirección no válida.");
        }

        // Validar restricciones de movimiento
        if (!esDamaEspecial) {
            if (color == Color.BLANCO && (direccion != Direccion.NORESTE && direccion != Direccion.NOROESTE)) {
                throw new IllegalArgumentException ("La dama blanca solo puede avanzar hacia el noreste o noroeste.");
            } else if (color == Color.NEGRO && (direccion != Direccion.SURESTE && direccion != Direccion.SUROESTE)) {
                throw new IllegalArgumentException ("La dama negra solo puede avanzar hacia el sureste o suroeste.");
            }
        }

        // Verificar si la nueva posición está dentro del tablero
        if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 'A' || nuevaColumna > 'H') {
            throw new IllegalArgumentException ("Movimiento no válido: la dama se sale del tablero.");
        }

        // Actualizar posición y estado de la dama especial
        this.posicion = new Posición(nuevaFila, nuevaColumna);

        if (color == Color.BLANCO && nuevaFila == 8 || color == Color.NEGRO && nuevaFila == 1) {
            this.esDamaEspecial = true;
        }
    }

    @Override
    public String toString() {
        return "Dama{" +
                "posicion=" + posicion +
                ", color=" + color +
                '}';
    }
}

