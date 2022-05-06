package domain;

public class Carta {

    private String palo;
    private String numero;


    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public void Cara (String palo, String numero) {

    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
