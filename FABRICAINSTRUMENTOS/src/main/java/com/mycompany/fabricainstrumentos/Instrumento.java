
package com.mycompany.fabricainstrumentos;


public class Instrumento {
    private String ID;
    private double Precio;
    private TiposIntrumentos tipo;

    public Instrumento() {
    }

    public Instrumento(String ID, double Precio, TiposIntrumentos tipo) {
        this.ID = ID;
        this.Precio = Precio;
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public TiposIntrumentos getTipo() {
        return tipo;
    }

    public void setTipo(TiposIntrumentos tipo) {
        this.tipo = tipo;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", Precio=" + Precio + ", tipo=" + tipo + '}';
    }

    
    
}
