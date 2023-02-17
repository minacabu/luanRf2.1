import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        int bornYear , presentYear;
        Scanner read = new Scanner(System.in);
        System.out.print("Insert your born year: ");
        bornYear = read.nextInt();
        System.out.print("Insert the current year: ");
        presentYear = read.nextInt();
        if (presentYear-bornYear >= 16){
            System.out.println("Congrats you can vote");
        }

    }
}
