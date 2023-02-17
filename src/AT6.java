import java.util.Scanner;

public class AT6 {
    public static void main(String[] args) {
        int value1, value2, value3;
        Scanner read = new Scanner(System.in);
        System.out.print("Insert your first value: ");
        value1 = read.nextInt();
        System.out.print("Insert your Second value: ");
        value2 = read.nextInt();
        System.out.print("Insert your third value: ");
        value3 = read.nextInt();
        if (value1 != value2 && value3 != value1) {
            if (value1 > value2 && value2 > value3){
            System.out.println("The sum of high values is: " + (value1 + value2) +" (First and second)");
        }       else if (value2 > value1 && value3 > value1){
        System.out.println("The sum of high values is: " + (value2 + value3)+ " (Second and third)");
        }       else if(value3 > value2 && value1 > value2){
        System.out.println("The sum of high values is: " + (value1 + value3)+ " (First and third)");}
        }

    }
}
