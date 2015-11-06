/**
 * Ting.
 * <p>
 * Denne klassen definerer ting.
 * Vegar Rorvik - vro006
 * INF 100 - Sem 3
 * 06/11 - 2015
 */
public class Ting {

    private String navn;
    private int antall;

    /**
     * Konstruktoer.
     *
     * @param n Navn.
     * @param a Antall.
     */
    Ting(String n, int a) {
        navn = n;
        antall = a;
    }

    /**
     * Setter navnet til tingen.
     *
     * @param n Navn.
     */
    public void settNavn(String n) {
        navn = n;
    }

    /**
     * Henter navnet til tingen.
     *
     * @return Navn.
     */
    public String hentNavn() {
        return navn;
    }

    /**
     * Setter antall av tingen.
     *
     * @param a Antall.
     */
    public void settAntall(int a) {
        antall = a;
    }

    /**
     * Henter antall av tingen.
     *
     * @return Antall.
     */
    public int hentAntall() {
        return antall;
    }

}

