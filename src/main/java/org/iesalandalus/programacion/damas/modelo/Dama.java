package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    private Color color;
    private Posición posicion;
    private Boolean esDamaEspecial;


    // Constructor
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
    public Posicion getPosicion() {
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

}
