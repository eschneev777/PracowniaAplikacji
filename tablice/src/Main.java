import jdk.swing.interop.SwingInterOpUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    int[] tablica=new int[10];
//
//    for(int i=0; i<tablica.length; i++) {
//        tablica[i]=i+1;
//        System.out.println("Kolejna komórka to "+tablica[i]);
//    }
//
//    System.out.println(tablica[5]);
//
//    String[] napisy={"Ala", "ma", "kota"};
//
//    double[] przecinki = new double[3];
//
//    przecinki[0]=1.5;
//    przecinki[1]=2.5;
//    przecinki[2]=3.5;


    //ZADANIE 1


    int[] tablica_parz = {1, 2, 3, 4, 5, 6, 7, 8};
    String[] tablica_nieparz = {"wiśnia", "czereśnia", "arbuz"};

    System.out.println("Co drugi element z parzystej: ");
    for (int i = 0; i < tablica_parz.length; i += 2) {
        System.out.println(tablica_parz[i]);
    }
    System.out.println("Co drugi element z tablicy nieparzystej");
    for (int i = 0; i < tablica_nieparz.length; i += 2) {
        System.out.println(tablica_nieparz[i]);
    }


    //ZADANIE 2

    int[] liczby = {98, 230, 777, 71, 34, 82, 83, 90, 55, 248, 49, 47, 448, 0, 11, 115, 601, 588};

    int max = liczby[0];

    for (int i = 1; i < liczby.length; i++) {
        if (liczby[i] > max) {
            max = liczby[i];
        }

    }

    System.out.println("Największa liczba z tablicy to: " + max);


//ZADANIE 3


    String[] wisnia = {"czereśnia", "kzesło", "kondensator", "logarytm", "sinus", "cosinus"};
    for (String czeresnia : wisnia) {

        System.out.println(czeresnia.toUpperCase());
    }


//ZADANIE 4


    Scanner sc = new Scanner(System.in);
//String slowa=new String[5];

    System.out.println("Wprowadź 5 słów");
    for (int i = 0; i < 5; i++) {
        System.out.println(i + 1);
        // slowa[i]=sc.nextLine();

    }


//ZADANIE 5

    int[] liczby8 = new int[8];

    System.out.println("Podaj 8 liczb całkowitych");

    for (int i = 0; i < 8; i++) {
        liczby8[i] = sc.nextInt();
    }

    Arrays.sort(liczby8);

    System.out.println("Liczby posortowane rosnąco: ");
    System.out.println(Arrays.toString(liczby8));


    //ZADANIE 8

    int[] liczby5 = new int[5];
    System.out.println("Podaj 5 liczb całkowitych, a program obliczy z nich silnię");
    for (int i = 0; i < 5; i++) {
        liczby5[i] = sc.nextInt();
    }

    System.out.println("Silnia z każdej liczby: ");

    for (int i = 0; i < 5; i++) {
        int n = liczby5[i];
        int silnia = 1;

        if (n < 0) {
            System.out.println("Silnia nie istnieje z liczb ujemnych");
        } else {
            for (int j = 1; j <= n; j++) {
                silnia *= j;
            }
        }
        System.out.println(n + "! = " + silnia);
    }


    //ZADANIE 7

    String[] miasta = {"Luksemburg, San Marino, Monako"};
    String[] panstwa = {"Luksemburg, San Marino, Monako"};

    boolean czyTakieSame = Arrays.equals(miasta, panstwa);

    if (czyTakieSame) {
        System.out.println("Tablice są takie same");
    } else {
        System.out.println("Tablice NIE są takie same");
    }


//ZADANIE 8

    int[] losowo = new int[10];
    Random random = new Random();

    for (int i = 0; i < losowo.length; i++) {
        losowo[i] = random.nextInt(21) - 10;
    }

    System.out.println("Zawartość tablicy: ");
    for (int liczba : losowo) {
        System.out.println(liczba + " ");
    }

    System.out.println();

    int min = losowo[0];
    int maks = losowo[0];
    int suma = 0;

    for (int liczba : losowo) {
        if (liczba < min) {
            min = liczba;
        }
        if (liczba > max) {
            maks = liczba;
        }
        suma += liczba;
    }

    double srednia = (double) suma / losowo.length;

    int mniejszeSr = 0;
    int wiekszeSr = 0;

    for (int liczba : losowo) {
        if (liczba < srednia) {
            mniejszeSr++;
        } else if (liczba > srednia) {
            wiekszeSr++;
        }
    }

    System.out.println("Najmniejszy element: " + min);
    System.out.println("Największy element: " + maks);
    System.out.println("Średnia arytmetyczna: " + srednia);
    System.out.println("Liczby mniejsze od średniej: " + mniejszeSr);
    System.out.println("Liczby większe od średniej: " + wiekszeSr);

    System.out.println("Liczby w odwrotnej koelejności: ");

    for (int i = losowo.length - 1; i >= 0; i--) {
        System.out.println(losowo[i] + " ");
    }


    //ZADANIE 9

int[] dwadziescia=new int[20];
    Random random2 = new Random();

    System.out.println("Wylosowane liczby: ");
    for(int i=0; i< dwadziescia.length; i++) {
        dwadziescia[i]=random2.nextInt(10)+1;
        System.out.println(dwadziescia[i] +" ");
    }

for( int i=1; i<=10; i++) {
    int powtarzac=0;
    for (int j=0; j< dwadziescia.length; j++) {
        if(dwadziescia[j]==i) {
            powtarzac++;
        }
    }
    System.out.println("Liczba "+ i + " powtarza się: "+powtarzac+" razy");
}
}