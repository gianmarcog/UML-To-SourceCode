import java.util.ArrayList;
import java.util.HashSet;

public class Hund extends Vierbeiner{

    private String[] lieblingsSpielzeug = new String[3];
    private HashSet<String> lieblingsFutter = new HashSet();

    private static int hundZaehler = 0;

    private static final String VERSION = "2.0";

    public void bellen() {}

    public void fressen(Fressnapf napf) {}
}
