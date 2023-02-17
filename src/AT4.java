import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        int value1, value2;
        Scanner read = new Scanner(System.in);
        System.out.print("Insert your first value: ");
        value1 = read.nextInt();
        System.out.print("Insert your Second value: ");
        value2 = read.nextInt();
        if (value1 == value2) {
            System.out.println("Don't insert the same value");}
        else if (value1 > value2){
            System.out.println("The "+value1+ " is  bigger than "+value2);}
        else{
            System.out.println("The "+value2+ " is  bigger than "+value1);
        }
    }
}

