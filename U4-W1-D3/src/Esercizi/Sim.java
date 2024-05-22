package Esercizi;

public class Sim {
    private int telefono;
    private double credito;
    private String[] ultime5Chiamate;

    public Sim(int numero ){
        this.telefono = numero;
        this.credito = 0;
        this.ultime5Chiamate = new String[5];

    }
    public void stampaDati(){
        System.out.println("Numero: " +this.telefono+ ", Credito: " +this.credito+ "€");
        System.out.println("Ultime 5 chiamate");
        for (int i = 0; i<this.ultime5Chiamate.length; i++) {
            System.out.println(this.ultime5Chiamate[i]);
        }
    }
    public void chiamate (int numeroChiamato, int durataChiamata){
        int minuti = durataChiamata / 60;
        int secondi = durataChiamata % 60;

        for (int i = ultime5Chiamate.length -1; i > 0; i--){
            ultime5Chiamate[i] = ultime5Chiamate[i - 1];
        }
        ultime5Chiamate[0] = String.format(numeroChiamato + "-" + minuti+ " m e" + secondi+ " s");

    }


}



