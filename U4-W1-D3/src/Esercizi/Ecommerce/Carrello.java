package Esercizi.Ecommerce;

import java.util.Arrays;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private int totaleCosto;

    public Carrello(Cliente clienteAssociato, Articolo[] elencoArticoli){
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totaleCosto = sommaCarrello(elencoArticoli);
    }

    public int sommaCarrello(Articolo[] elencoArticoli){
        for (int i = 0; i<elencoArticoli.length; i++) {
            totaleCosto += elencoArticoli[i].getPrezzo();
        }
        return totaleCosto;
    }
    @Override
    public String toString() {
        return "Carrello{" +
                "clienteAssociato: " +clienteAssociato+
                ", elencoArticoli: " + Arrays.toString(elencoArticoli)+
                ", totaleCosto: " +totaleCosto+ "}";
    }
}
