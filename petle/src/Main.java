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

    int liczby;
    

    do{
        liczby=sc.nextInt();

    }while(liczby!=0);

}
