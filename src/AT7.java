import java.util.Scanner;

public class AT7 { public static void main(String[] args) {
    int value1, value2, value3;
    Scanner read = new Scanner(System.in);
    System.out.print("Insert your first value: ");
    value1 = read.nextInt();
    System.out.print("Insert your Second value: ");
    value2 = read.nextInt();
    if (value1 == value2){
        System.out.println("the numbers are the same");}
        else if (value1 > value2){
            System.out.println("The First number are high than second:");
        }       else if (value2 > value1){
            System.out.println("The Second number is high than first");
        }
    }

}
