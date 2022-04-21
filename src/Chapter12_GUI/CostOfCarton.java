package Chapter12_GUI;

import java.util.Scanner;

public class CostOfCarton {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double width;

        double cost;

        System.out.println("Enter width: ");
        width = input.nextDouble();
        System.out.println("You entered: "  + width);

        cost = (20 * Math.pow(width, 2)) + (180/width);

        System.out.println("Cost is " + cost);





    }
}
