import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Say something to Bob.");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        boolean isYelling = userInput.equals(userInput.toUpperCase());
        boolean nothing = userInput.isEmpty();


        if (userInput.endsWith("?")){

            System.out.println("Sure");
        }else if (isYelling) {
            System.out.println("Whoa, Chill Out");

        }else if (nothing) {
            System.out.println("Fine, Be that way.");

        }else {
            System.out.println("Whatever");
        }


    }
}
