int wynik = 1;
int wynik3 = 0;
void Z1(int n){
if(n!=1){
        wynik=wynik*n;
        n-=1;
        Z1(n);
}
else{
    System.out.println(wynik);
}
}
void Z2(int a){
for(int i =0; i<=a; i++){
    System.out.println("rosnąco: "+i);
}
for(int i =a; i>=0; i--){
    System.out.println("malejąco: "+i);
    }
}
void Z3(int c){
    if(c!=0) {
        int jedn = c % 10;
        c /= 10;
        wynik3+=jedn;
        Z3(c);

    }else{
        System.out.println("Suma cyfr: "+wynik3);
    }
}
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę");
    int n = sc.nextInt();
    Z1(n);
    Z2(n);
    Z3(31223);
}
