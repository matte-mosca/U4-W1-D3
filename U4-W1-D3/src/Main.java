import Esercizi.Rettangolo;
import Esercizi.Sim;
import Esercizi.Ecommerce.Cliente;
import  Esercizi.Ecommerce.Articolo;
import Esercizi.Ecommerce.Carrello;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        Rettangolo Rettangolo1 = new Rettangolo(6,3);
        Rettangolo Rettangolo2 = new Rettangolo(10, 5);
        Rettangolo.stampaDueRettangoli(Rettangolo1, Rettangolo2);

        System.out.println("Esercizio 2");

        Sim Sim1 = new Sim(353457253);
        Sim1.chiamate(339692676, 180);
        Sim1.chiamate(36612312, 12);
        Sim1.chiamate(345355460, 98);
        Sim1.chiamate(34687332, 28);
        Sim1.chiamate(335363905, 163 );
        Sim1.stampaDati();

        Sim1.chiamate(345355466, 37);
        Sim1.stampaDati();

        System.out.println("Esercizio 3");

        Cliente matteo = new Cliente(1, "Matteo Moscardini", "matttmosca@gmail.com", "06-05.1999");
        Articolo cioccolata = new Articolo(16, "Fondente 90% cacao", 6, 60);
        Articolo mozzarella = new Articolo(27,"Mozzarella di bufala campana DOP", 9, 22);
        Articolo accendino = new Articolo(19,"Bic rosso medio", 1, 120);
        Articolo[] articolos = {cioccolata, mozzarella, accendino};
        Carrello cart = new Carrello(matteo,articolos);
        System.out.println(matteo);
        System.out.println(Arrays.toString(articolos));
        System.out.println(cart);


        }
    }
