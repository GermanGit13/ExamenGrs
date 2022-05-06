package domain;

import java.util.ArrayList;

public class Jugador {

    private Carta carta;
    private String nombre;
    private ArrayList<Carta> catalogoCartas;
    private int puntos;

    public Jugador(Carta carta, String nombre, ArrayList<Carta> catalogoCartas, String nombre1, int puntos) {
        this.carta = carta;
        this.nombre = nombre;
        this.catalogoCartas = catalogoCartas;
        this.nombre = nombre1;
        this.puntos = puntos;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getCatalogoCartas() {
        return catalogoCartas;
    }

    public void setCatalogoCartas(ArrayList<Carta> catalogoCartas) {
        this.catalogoCartas = catalogoCartas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void preguntarMovimiento() {

    }

    public void addCarta(Carta carta) {

    }

    public void imprimirCartas() {

    }

    public void resetearRonda() {

    }
}
