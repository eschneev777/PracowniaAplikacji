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




}
