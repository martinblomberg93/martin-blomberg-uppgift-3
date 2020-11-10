import java.util.Scanner;
/**
 * klassen FilmBookning innehåller en main metod och låter användaren boka en biljett för
 * en filmvisning i ett urval av filmer samt sätesplats.
 * du får sedan ett meddelande om vilken film och säte som reserverats till dig.
 * vid val av avbokning ger programmet användaren möjigheten att avboka sin reservation
 * eller avryta avbokningen.
 */
public class FilmBooking
{
    public static void main(String[] args)
    {
        // scanner för att ta emot data.
        int input = 0;
        boolean booking = true;
        FilmList book = new FilmList();
        Scanner s = new Scanner(System.in);

        System.out.println("---Välkommen till biljettbokning---\n");
        //Användaren väljer Ny bokning eller avbokning
        while(booking)
        {
            System.out.println("1.Bokning \n2.Avbokning\n3.Avsluta");
            input = s.nextInt();

            // användaren får välja vilken film hen vill boka
            if (input == 1)
            {
                System.out.println("Vilken film vill du boka?");
                FilmList.ListMovies();
                input = s.nextInt();
                if (input >= 1 && input <= 5)
                {
                    book.ReserveSeat(FilmList.GetMovie(input - 1));
                    // användaren får välja vilken plats hen vill ha
                    System.out.println("Vart vill du sitta? ( plats 1 - 20 är tillgängliga)");
                    input = s.nextInt();
                    if (input >= 1 && input <= 20)
                    {
                        book.ReserveSeat(input);

                        // meddelande om vilken film och sätesplats som reserverats
                        System.out.println("Din valda film är " + book.pickedMovie + " och din reserverade plats är " + book.pickedSeat);
                    }
                    // meddelande visas om användarens imatning är incorrekt <----
                    else
                    {
                        System.out.println("Plats hittades ej, var god försök igen\n");
                        book.ReserveSeat(null);
                    }

                }
                else
                {
                    System.out.println("Film hittades ej, var god försök igen\n");
                }
            }
            // om en avbokning ej finns
            else if (input == 2)
            {
                if(book.pickedMovie == null)
                {
                    System.out.println("Det finns ingen bokning\n");
                }
                // om avboka reserverad film
                else
                {
                    System.out.println("Vill du avboka din bokning på " + book.pickedMovie + "?");
                    System.out.println("1. avboka \n2. avbryt");
                    input = s.nextInt();
                    // tar bort användarens reservering av film
                    if(input == 1)
                    {
                        book.CancelReservation();
                        System.out.println("Din reservation är nu avbokad\n");
                    }
                    // avbryter avbokning
                    else if(input == 2)
                    {
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Valet finns ej, var god försök igen\n");
                    }
                }

            }
            // vid avslut av bokningsprogrammet
            else if(input == 3){
                booking = false;
            }
            // vid fel inmatning av kategori
            else
            {
                System.out.println("Valet finns ej, var god försök igen\n");
            }
        }
    }
}
