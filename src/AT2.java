import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        double apples=1.30 ,quantinty=0;
        Scanner read = new Scanner(System.in);
        System.out.print("How many apples you want? ");
        quantinty = read.nextDouble();
        if(quantinty >=12) { apples =1.00;}
        System.out.print(" The total price is USD "+(apples*quantinty));    }}
