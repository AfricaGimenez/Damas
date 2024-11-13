package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    SURESTE( "Sureste"),
    SUROESTE("Suroeste"),
    NORESTE("Noreste"),
    NOROESTE("Noroeste");

    private String cadenaAMostrar;

    Direccion(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}


