//Permutations in which n people can occupy r seats in a classroom 

import java.util.*;
public class Permutation
    {
        public static void main(String[] args)
        {

            int n, r, per, fact1, fact2;

            Scanner sc =  new Scanner(System.in);

            System.out.println("Enter number of people: ");
            n = sc.nextInt();

            System.out.println("Enter number of seats: ");
            r = sc.nextInt();

            fact1 = 1;

            for (int i = n; i > 1; i=i-1)
            {
                fact1 = fact1 * i;
            }

            int number;

            number = n - r;

            fact2 = 1;

            for (int i = number; i > 1; i=i-1)
            {
                fact2 = fact2 * i;
            }

            per = fact1 / fact2;

            System.out.println(per+" Total possible arrangements:");
        }
    }

