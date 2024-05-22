package Esercizi;

public class Rettangolo {
    private int base, altezza, area, perimetro;

    public Rettangolo(int b, int h){
        this.base = b;
        this.altezza = h;
        this.area = b * h;
        this.perimetro = (base + altezza) * 2;
    }

    public void stampaRettangolo (){
        System.out.println("Base rettangolo: " + this.base + ", altezza: " + this.altezza + ", area: " + this.area + ", perimetro: " + this.perimetro);
    }
    public static void stampaDueRettangoli (Rettangolo r1, Rettangolo r2){
        r1.stampaRettangolo();
        r2.stampaRettangolo();
        System.out.println("Area di r1: " + r1.area + ", area di r2 " + r2.area + ", somma aree: " + (r1.area + r2.area) + ". Perimetro r1: " + r1.perimetro + ", perimetro r2: " + r2.perimetro + ", somma perimetri: " + (r1.perimetro + r2.perimetro));



    }
}
