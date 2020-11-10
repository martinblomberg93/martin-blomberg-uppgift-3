/**
 * klassen FilmList håller två fält av typen string som innehåller filmer "movies" och visningstider för filmerna "time"
 * klassen innehåller variabler av typen string och int med variabler för vald film och säte att sparas i.
 * samt hur många säten som finns i biografen
 */
public class FilmList
{
    static String[] movies = { "Pirates of the Caribbean", "The Notebook", "Matrix", "Jurassic park","Dracula 1992"};
    static String[] time = {" 10:00", " 12:00", " 14:00", " 16:00", " 18:00"};

    String pickedMovie = null;
    int pickedSeat = 0;

    /**
     * metoden sparar hämtat värde i pickedMovie i form av string
     * @param m inmatad film
     */
    public void ReserveSeat(String m)
    {
        pickedMovie = m;
    }

    /**
     * metoden sparar hämtat värde i pickedSeat i form av int
     * @param s inmatat säte
     */
    public void ReserveSeat(int s)
    {
        pickedSeat = s;
    }

    /**
     *  metoden ersätter värdena av variablerna pickedMovie och pickedSeat
     */

    public void CancelReservation()
    {
        pickedMovie = null;
        pickedSeat = 0;
    }

    /**
     * Metoden ListMovies matar ut till användaren ett urval av filmer och vilken tid filmerna visas på.
     */
    static void ListMovies()
    {
        System.out.println("1. " + movies[0] + time[0]);
        System.out.println("2. " + movies[1] + time[1]);
        System.out.println("3. " + movies[2] + time[2]);
        System.out.println("4. " + movies[3] + time[3]);
        System.out.println("5. " + movies[4] + time[4]);
    }

    /**
     *  dokumentera metod
     * @param t index för filmen användaren väljer
     * @return namnet på filmen för valt index
     */
    static String GetMovie(int t)
    {
        return movies[t];
    }
}
