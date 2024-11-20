package org.iesalandalus.programacion.damas.modelo;

public class Posicion {
    private int Fila;
    private char Columna;

    public Posicion(int fila, char c) {
    }

    public int getFila() {
        return Fila;
    }

    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
            throw new IllegalArgumentException("Las filas solo pueden estar entre 1 y 8");
        }
        Fila = fila;
    }

    public char getColumna() {
        return Columna;
    }

    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("La columna debe estar entre 'a' y 'h'.");
        }
        Columna = columna;
    }
    public Posicion(Posicion otra){
        this.Fila = otra.Fila;
        this.Columna = otra.Columna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.iesalandalus.programacion.damas.modelo.Posicion posición = (org.iesalandalus.programacion.damas.modelo.Posicion) o;
        return Fila == posición.Fila && Columna == posición.Columna;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(Fila, Columna);
    }

    @Override
    public String toString() {
        return "Fila =" + Fila + ", Columna = " + Columna;
    }
}
