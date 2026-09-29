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
        }

//ZADANIE 4

