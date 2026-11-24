import java.util.Random;

public class Kosc {
    public static int liczbaInstancji = 0;
    public String[] nazwyPlikow = {"kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png", "kosc4.png", "kosc5.png", "kosc6.png"};
    public int liczbaOczek;
    public int idObrazu;
    public boolean dostepna;

    public Kosc(int podaneOczka) { //konstruktor
        if (podaneOczka < 1 || podaneOczka > 6) {
            this.liczbaOczek = 0;
            this.idObrazu = 0;
        } else {
            this.liczbaOczek = podaneOczka;
            this.idObrazu = podaneOczka;
        }
        this.dostepna = true;
        liczbaInstancji++;
    }

    public Kosc() {
    /*
    Losuje liczbe pseudoklasowa z zakreu 1-6
    */
        Random rand = new Random();
        this.liczbaOczek = rand.nextInt(6) + 1;  //<1-7)
        this.idObrazu = this.liczbaOczek;

        //prztpisuje wartosc polu logicznemy:kosc jest dostepna
        this.dostepna = true;
        liczbaInstancji++;
    }


    //metoda ogldostepna
    public void rzutKosci() {
        if (this.dostepna) {
            Random rand = new Random();
            this.liczbaOczek = rand.nextInt(6) + 1;  //<1-7)
            this.idObrazu = this.liczbaOczek;
        }
    }


    //metoda publiczna bez zwracania

    public void blokujKosc() {
        this.dostepna = false;
    }


    // metoda ogolnodostepna bezparametrowa ze zwracaniem


    public String wartoscKosci() {
        String wartosc = "Zero zero zero zero";
        switch (this.liczbaOczek) {
            case 1:
                return "jeden";
            case 2:
                return "dwa";
            case 3:
                return "trzy";
            case 4:
                return "cztery";
            case 5:
                return "pięć";
            case 6:
                return "sześć";
            default:
                return "zero";


        }
    }


}
