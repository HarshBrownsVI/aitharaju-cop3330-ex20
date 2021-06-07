/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
import  java.text.DecimalFormat;

public class Ex20
{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double amt;
        double tax;
        String state, county;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("What is the order amount?");
        amt = kb.nextDouble();
        System.out.print("What state do you live in?");
        state = kb.next();

        if(state.equals("Wisconsin"))
        {
            tax = amt * (double)(0.05);

            System.out.print("What county do you live in?");
            county = kb.next();

            if(county.equals("Dane"))
            {
                tax += 0.004;
            }
            if(county.equals("Eau Claire"))
            {
                tax += 0.005;
            }
            System.out.println("The tax is: $" + tax);
            amt = amt + tax;
        }
        else if(state.equals("Illinois"))
        {
            tax = amt * (0.08);
            System.out.println("The tax is: $" + df.format(tax));
            amt = amt + tax;
        }
        System.out.println("The total is: $" + df.format(amt));
    }
}
