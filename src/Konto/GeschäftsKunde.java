package Konto;

public class GeschäftsKunde extends Kunde {
    public GeschäftsKunde() {

    }

    GeschäftsKunde(int _nummer) {
        setKonto(new GeschäftsKonto(_nummer));
    }

    public void finalize() {
        System.out.println("Kein GK mehr :(");
    }
}
