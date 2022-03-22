package Konto;

public class PrivatKunde extends Kunde {
    public PrivatKunde() {

    }

    PrivatKunde(int _nummer) {
        setKonto(new PrivatKonto(_nummer));
    }
}
