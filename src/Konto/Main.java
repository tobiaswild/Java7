package Konto;

public class Main {
    public static void main(String[] args){
        Kunde meinKunde = new GeschäftsKunde(1234);
        System.out.println(meinKunde.getKonto().getNummer());
    }
}
