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


    int[] tablica_parz={1, 2, 3, 4, 5, 6, 7, 8};
    String[] tablica_nieparz={"wiśnia", "czereśnia", "arbuz"};

    System.out.println("Co drugi element z parzystej: ");
    for(int i=0; i<tablica_parz.length; i+=2) {
        System.out.println(tablica_parz[i]);
    }
    System.out.println("Co drugi element z tablicy nieparzystej");
    for(int i=0; i<tablica_nieparz.length; i+=2) {
        System.out.println(tablica_nieparz[i]);
    }



    //ZADANIE 2

    int[] liczby={98, 230, 777, 71, 34, 82, 83, 90, 55, 248, 49, 47, 448, 0, 11, 115, 601, 588};

    int max=liczby[0];

    for(int i=1; i<liczby.length; i++) {
        if (liczby[i] > max) {
                max=liczby[i];
            }

        }

        System.out.println("Największa liczba z tablicy to: " + max);




//ZADANIE 3


String[] wisnia={"czereśnia", "kzesło", "kondensator", "logarytm", "sinus", "cosinus"};
for(String czeresnia : wisnia){

    System.out.println(czeresnia.toUpperCase());
        }


//ZADANIE 4


Scanner sc=new Scanner(System.in);
//String slowa=new String[5];

    System.out.println("Wprowadź 5 słów");
    for(int i=0; i<5; i++) {
        System.out.println(i+1);
       // slowa[i]=sc.nextLine();

    }



//ZADANIE 5

int[] liczby8=new int[8];

    System.out.println("Podaj 8 liczb całkowitych");

    for(int i=0; i<8; i++) {
        liczby8[i]=sc.nextInt();
    }

   Arrays.sort(liczby8);

    System.out.println("Liczby posortowane rosnąco: ");
    System.out.println(Arrays.toString(liczby8));


 //ZADANIE 8

        int[] liczby5=new int[5];
    System.out.println("Podaj 5 liczb całkowitych, a program obliczy z nich silnię");
    for (int i=0; i<5; i++) {
        liczby5[i]=sc.nextInt();
    }

    System.out.println("Silnia z każdej liczby: ");

    for(int i=0; i<5; i++) {
        int n=liczby5[i];
        int silnia=1;

        if(n<0) {
            System.out.println("Silnia nie istnieje z liczb ujemnych");
        } else {
            for(int j=1; j<=n; j++) {
                silnia*=j;
            }
        }
        System.out.println(n+"! = " +silnia);
    }


    //ZADANIE 7

    

}