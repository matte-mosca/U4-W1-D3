package Esercizi.Ecommerce;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int pezziRimasti;

    public Articolo (int codiceArticolo, String descrizioneArticolo, int prezzo, int pezziRimasti){
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziRimasti = pezziRimasti;
    }

    @Override
    public String toString() {
        return "Articolo {" +
                "codiceArticolo: " +codiceArticolo +
                ", descrizioneArticolo: " + descrizioneArticolo +
                "prezzo: " + prezzo +
                "pezziRimasti " + pezziRimasti +
                "}";
    }
    public int getPrezzo() {
        return prezzo;
    }
}
