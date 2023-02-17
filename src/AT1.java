import java.util.Scanner;
//make a code to receive a value and print if it is zero, positive or negative
public class AT1 {
    public static void main(String[] args) {
        int number =0;
        Scanner read = new Scanner(System.in);
        System.out.print("Insert your number ");
        number = read.nextInt();
        if (number == 0) {
            System.out.println("The number is zero");
        } else if (number >0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        }
    }

