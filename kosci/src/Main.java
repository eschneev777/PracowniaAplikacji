//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Kosc kosc1= new Kosc(4);

    System.out.println("Przed rzutem: " + kosc1.liczbaOczek);
    kosc1.rzutKosci();
    System.out.println("Po 1: " + kosc1.liczbaOczek);
    kosc1.rzutKosci();

}
