package org.iesalandalus.programacion.damas.modelo;

public class Posición {
    private int Fila;
    private char Columna;

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
        if (columna < 1 || columna > 8) {
            throw new IllegalArgumentException("Las filas solo pueden estar entre 1 y 8");
        }
        Columna = columna;
    }

    public Posición(int fila, char columna) {
        this.Fila = fila;
        this.Columna = columna;
    }

    public Posición(Posición otra){
        this.Fila = otra.Fila;
        this.Columna = otra.Columna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        org.iesalandalus.programacion.damas.modelo.Posición posición = (org.iesalandalus.programacion.damas.modelo.Posición) o;
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
