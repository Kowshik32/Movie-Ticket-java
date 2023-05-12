import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie_List movie_list = new Movie_List();
        Seat_Book seat_book = new Seat_Book();
        Cancel cancel = new Cancel();
        while (true){
            System.out.println("1.View Movie List");
            System.out.println("2.Book Tickets");
            System.out.println("3.Cancel Booking");
            System.out.println("4.Exit");
            int ch=scanner.nextInt();
            switch (ch){
                case 1: movie_list.view();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        break;
                case 2: seat_book.view();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        break;
                case 3: seat_book.callCancel();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        break;
                case 4: return;
            }
        }
    }
}