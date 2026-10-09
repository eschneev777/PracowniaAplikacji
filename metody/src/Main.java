//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int wiek= wiek();
    System.out.println("Mój wiek to: "+wiek);

    String imie=imie();
    System.out.println("Moje imię to: "+imie );

    System.out.println(dzialania(7, 2));

    System.out.println("Parzysta? "+parzysta(434));

    System.out.println("Czy liczba 777 podzielna przez 3 i 5? - "+ podzielnosc35(777));

    System.out.println("Liczba 7 do potęgi 3 = "+potega3(7));

    System.out.println("Pierwiastek kwadratowy z liczby 4489: "+ pierwiastek(4489));

    System.out.println(czyTrojkatProstokatny(3, 4, 5));
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


public boolean podzielnosc35(int podzielnosc) {
    return podzielnosc%15==0;
}


public int potega3(int potega) {
    return potega*potega*potega;
}

public double pierwiastek(int pierwiastek) {
        return Math.sqrt(pierwiastek);
}

public static boolean czyTrojkatProstokatny(double a, double b, double c) {
    if (a <= 0 || b <= 0 || c <= 0) {
        return false;
    }

    double najdluzszy = Math.max(a, Math.max(b, c));

    if (najdluzszy == a) {
        return a * a == b * b + c * c;
    } else if (najdluzszy == b) {
        return b * b == a * a + c * c;
    } else {
        return c * c == a * a + b * b;
    }
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