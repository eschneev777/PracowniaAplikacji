//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//
//    boolean warunek =true;
//    System.out.println(warunek);
//
//    if (warunek)
//    {
//        System.out.println("Warunek prawdziwy");
//
//    } else {
//        System.out.println("Warunek nieprawdziwy");
//    }
//
//    int liczba1=5;
//    int liczba2=10;
//    if (liczba1>liczba2) {
//        System.out.println(liczba1 + " jest większa niż "+ liczba2);
//
//    } else if (liczba1==liczba2) {
//        System.out.println("Liczby są równe");
//    } else {
//        System.out.println(liczba2+ " jest większa niż "+ liczba1 );
//    }
//
//
//    if(liczba1 != liczba2) {
//
//        System.out.println("Liczby są różne");
//    }
//
//
//    String napis1="napis";
//    String napis2="napis";
//
//    if(napis1.equals(napis2)) {
//        System.out.println("Napisy są takie same");
//    }
//
//Scanner sc = new Scanner(System.in);
//
//    System.out.println("Podaj liczbę");
//    int liczba =sc.nextInt();
//
//    switch (liczba) {
//        case 0:
//            System.out.println("Zmienna ma wartość zero");
//            break;
//        case 5:
//            System.out.println("Zmienna ma wartość 5");
//            break;
//        case 67:
//            System.out.println("Jesteś chory");
//            break;
//        default:
//            System.out.println("Nie wybrałeś jakiejś specjalnej liczby");
//    }
//
//
//boolean wyrazenie1 = true && false; // 1 i 0 -> 0
//    System.out.println(wyrazenie1);
//
//    boolean wyrazenie2 = true || false; // 1 lub 0 -> 1
//    System.out.println(wyrazenie2);
//
//

    //Logowanie

//    String login, haslo;
//    login="user";
//    haslo="passwd";
//
//    String loginPodany, hasloPodane;
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Podaj login:");
//    loginPodany=sc.nextLine();
//    System.out.println("Podaj hasło:");
//    hasloPodane=sc.nextLine();
//
//    if(hasloPodane.equals(haslo) && loginPodany.equals(login)) {
//
//        System.out.println("Zalogowałeś się");
//    } else if(loginPodany.equals(login) && !hasloPodane.equals(haslo)) {
//        System.out.println("Złe hasło");
//    } else {
//        System.out.println("Zły login lub hasło");
//    }

//
//    String poraRoku="Lato";
//    String tlumaczenie=switch(poraRoku) {
//        case "Wiosna":
//            yield "Fru:hling"; // case "Wiosna" -> "Fru:hling":
//        case "Lato":
//            yield "Sommer";
//        case "Jesień":
//            yield "Herbst";
//        case "Zima":
//            yield "Winter";
//        default:
//            yield "Słowo nieznane";
//
//
//
//    };
//    System.out.println(tlumaczenie);
//
//
//String temperatura = switch (poraRoku) {
//    case "Wiosna", "Lato" -> "piekło";
//    case "Jesień", "Zima" -> "jest super";
//    default -> "wartość nieznana";
//
//};
//
//    System.out.println(temperatura);
//
//    // operator warunkowy trójargumentowy (warunek) ? tak : nie
//
//    int liczba = 10;
//    String wynik = (liczba>0) ? "Dodatnia" : "Ujemna lub 0";
//    System.out.println(wynik);
//
//
//
//
//
//
    //ZADANIE 1


    System.out.println("Wprowadź liczbę, a program sprawdzi czy jest podzielna przez 3");

    Scanner sc = new Scanner(System.in);
    int liczba3=sc.nextInt();

    if(liczba3%3 == 0) {

        System.out.println("Liczba jest podzielna przez 3");

    } else {
        System.out.println("Liczba nie jest podzielna przez 3");
    }


    //ZADANIE 2

    System.out.println("Program sprawdza czy można zbudować trójkąt o podanych wymiarach. Wprowadź pierwszą długość boku: ");
    int bok1=sc.nextInt();
    System.out.println("Wprowadź długość drugiego boku:");
    int bok2=sc.nextInt();
    System.out.println("Wprowadź długość trzeciego boku: ");
    int bok3=sc.nextInt();

    if (bok1+bok2>bok3) {
        if(bok1+bok3>bok2) {
            if (bok2 + bok3 > bok1) {

            }
                System.out.println("Da się zbudować trójkąt o podanych wymiarach");


            } else {
                System.out.println("nie bendzie trujkonta");

            }

        }


//ZADANIE 3

    System.out.println("Program wypisuje wiekszą liczbę spośród dwóch. Wprowadź pierwszą liczbę: ");
    int liczbaa1 = sc.nextInt();
    System.out.println("Wprowadź drugą liczbę:");
    int liczbaa2= sc.nextInt();

    if(liczbaa1>liczbaa2) {
        System.out.println(liczbaa1 + " jest większa");
    } else if(liczbaa2>liczbaa1) {
        System.out.println(liczbaa2 + " jest większa");
    } else {
        System.out.println("Liczby są równe");
    }



    //ZADANIE 4

    System.out.println("Program wypisuje największą liczbę spośród trzech. Wprowadź pierwszą liczbę:");
    int number1=sc.nextInt();
    System.out.println("Wprowadź drugą liczbę:");
    int number2=sc.nextInt();
    System.out.println("Wprowadź trzecią liczbę");
    int number3=sc.nextInt();

    if(number1>number2 && number1>number3) {
        System.out.println(number1 + "jest największe");
    } else if(number2>number1 && number2>number3){
        System.out.println(number2 + " jest największa");
    } else if(number3>number1 && number3>number2) {
        System.out.println(number3 + " jest największa");
    } else {
        System.out.println("Wszystkie liczby są sobie równe");
    }


}
