//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int wiek= wiek();
    System.out.println("Mój wiek to: "+wiek);

    String imie=imie();
    System.out.println("Moje imię to: "+imie );

    System.out.println(dzialania(7, 2));

    System.out.println("Parzysta? "+parzysta(434));
//
//metoda();
//int zmienna=zwrot();
//    System.out.println("Zwrócona wartość: "+zmienna);
//
//    int liczba1 = 2;
//    System.out.println("Suma dwóch liczb: " + suma(liczba1, 3));

}


public int wiek() {
    return 18;
}

public String imie() {
    return "Sandra";
}

public String dzialania( int a, int b) {

    int suma=a+b;
    int roznica=a-b;
    int iloczyn=a*b;
    return "Suma: " + suma + ", Różnica: " + roznica + ", Iloczyn: " + iloczyn;

}

public boolean parzysta(int liczba) {
    return liczba%2==0;
}
//public void metoda() {  //void nic nie zwraca
//    System.out.println("metoda");
//}
//
//
//public  int zwrot() {
//    return 777;
//}
//
//
//public int suma(int a, int b) {
//    int wynik=a+b;
//    return wynik;
//   // return a+b;
//}