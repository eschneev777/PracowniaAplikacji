//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//
//  int licznik=20;
//
//    while(licznik<10) {
//        System.out.println("Licznik: " +licznik);
//        licznik++;
//    }

//    do {
//        System.out.println("Licznik: "+licznik);
//        licznik++;
//
//
//    }while(licznik<10);
//
//    for(int i=0; i<5; i++) {
//        System.out.println("Zewnętrzna pętla");
//        for(int j=0; j<5; j++) {
//            System.out.println("Pętla wewnętrzna");
//        }
//    }
//
//

    //ZADANIE 1

    Scanner sc=new Scanner(System.in);
    System.out.println("Wprowadź liczbę całkowitą dodatnią, a program wyświetli wszystkie liczby nieparzyste od podanej liczby");

    int calkowita=sc.nextInt();
    for(int i=1;i<=calkowita; i+=2){
        System.out.println(i + " ");
    }

    //ZADANIE 2

    System.out.println("Wprowadź liczbę całkowitą dodatnią, a program wypisze wszytskiee potęgi liczby 2 do wskazanej, podanej tu liczby");

    int n=sc.nextInt();
    for(int i=1; i<=n; i*=2) {
        System.out.println(i+" ");
    }


    //ZADANIE 3

    System.out.println("Program wczytuje liczby dopóki nie zostanie podane 0. Wyświetla sumę wprowadzonych liczb.");
int suma=0;
int liczba;

    do{
         liczba= sc.nextInt();
        suma+=liczba;

    }while (liczba!=0);
    System.out.println(suma);


    //ZADANIE4

    System.out.println("Progran pobiera ciąg liczb całkowitych. Zakończenie pobierania ciągu liczb, kończy wpisanie zera. Na końcu program wyświetla sumę największej i najmniejszej liczby z ciągu oraz ich średnią arytmetyczną.");

    int liczby=sc.nextInt();

    int min=liczby;
    int max=liczby;

    while(true) {
        liczby=sc.nextInt();

        if (liczby==0) {
            break;
        }

        if (liczby<min){
            min=liczby;

        }

        if (liczby>max) {
            max=liczby;
        }
    }

    int suma2=max+min;
    double srednia=suma/2;

    System.out.println("Największa liczba: "+max);
    System.out.println("Najmniejsza liczba: "+min);
    System.out.println("Suma największej i najmniejszej: "+suma2);
    System.out.println("Średnia największej i najmniejszej: "+srednia);


//ZADANIE 5

    System.out.println("Program losuje liczbę z zakresu 1 do 100, a użytkownik ma za zadanie odgadnąć jaka to liczba.");

    Random random=new Random();
    int wylosowana= random.nextInt(100)+1;
    int wpisana=0;

    while (wpisana!=wylosowana) {

        if (sc.hasNextInt()) {
            wpisana=sc.nextInt();

            if(wpisana>wylosowana) {
                System.out.println("Za dużo");
            } else if(wpisana<wylosowana) {
                System.out.println("za mało");
            } else {
                System.out.println("Gratulacje użytkowniku, odgadłeś liczbę");
            }

        }


    }



}
