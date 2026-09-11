//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//zadanie 1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

//zadanie 2
    String imie = "Sandra";
    int rok_urodzenia = 2008;
    double liczba_przechow = 0.66;

    //zadanie 3
    System.out.println("Mam na imię "+imie+ " ,mam "+(2026-rok_urodzenia) + " lat i będę pisać maturę za "+liczba_przechow+ " roku.");

//zadanie 4
    System.out.println("Podaj jaką masz temperaturę na polu");

    Scanner sc = new Scanner(System.in);

    double stopnie = sc.nextDouble();

    double fahrenheit = 1.8*stopnie+32;

    if (fahrenheit>=67) {
        System.out.println("TO chyba nie żyjesz.");
    }

    System.out.println("Temperatura w stopniach Fahrenheita: "+fahrenheit);

//zadanie 5
    System.out.println("Program liczy obwód trójkąta. Wprowadź długości boków.");

    int pierwszy_bok=sc.nextInt();
    int drugi_bok=sc.nextInt();
    int trzeci_bok=sc.nextInt();

    int obwod_trujkont=pierwszy_bok+drugi_bok+trzeci_bok;

    System.out.println("Obwód trójkąta wynosi: "+obwod_trujkont);

//zadanie 6
    System.out.println("Program wczytuje w odwrotnej kolejności trzy słowa wprowadzone przez użytkownika. Wprowadź trzy słowa:");

    System.out.println("Pierwsze słowo: ");
    sc.nextLine();
    String pierwsze_slowo=sc.nextLine();
    System.out.println("Drugie słowo: ");
    String drugie_slowo=sc.nextLine();
    System.out.println("Trzecie słowo: ");
    String trzecie_slowo=sc.nextLine();

    System.out.println(trzecie_slowo+", "+drugie_slowo+", "+pierwsze_slowo);


    

}
