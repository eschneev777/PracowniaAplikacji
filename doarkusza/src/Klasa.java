public class Klasa {
    public int rozmiarTablicy;
    String[] tablicaNapisow;

    public Klasa(int rozmiar, String[] tablica) {
        this.tablicaNapisow=new String[rozmiar];
        this.rozmiarTablicy=rozmiar;
        for (int i=0; i<tablica.length; i++) {
            this.tablicaNapisow[i]=tablica[i];
        }
    }

    public Klasa() {

    }


    public void wyswietl() {
        for(int i=0; i<this.rozmiarTablicy; i++) {
            System.out.println("Element tablicy nr "+(i+1)+" to "+this.tablicaNapisow[i]);
        }
    }
}
