import java.util.Scanner;

public class LCM {

        public static void main(String[] args) {
            int x ,y;
            int hcf = 1,temp;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter  first number: ");
            x = in.nextInt();
            System.out.print("Enter second number: ");
            y = in.nextInt();
            for(int i = 1; i <= x && i <= y; ++i)
            {
                // Checks if i is factor of both integers
                if(x % i == 0 && y % i == 0)
                    hcf = i;
            }
            int lcm = (x * y) / hcf;
            System.out.printf("The LCM of "+x+" and "+y+" is "+lcm);

        }
    }


