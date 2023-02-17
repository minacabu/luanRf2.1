import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        double balance, credit, debit;
        Scanner read = new Scanner(System.in);
        System.out.print("Insert the balance value  ");
        balance = read.nextDouble();
        System.out.print("Insert the credit value   ");
        credit  = read.nextFloat();
        System.out.print("Insert the debit value    ");
        debit= read.nextFloat();
        if(((balance- credit)+ debit)<=0){
            System.out.println("Your final balance is negative");
           }else{
                System.out.println("Your final balance is positive");{
    }   }          }}