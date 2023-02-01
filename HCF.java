import java.util.Scanner;
public class HCF {
        public static void main(String[] args) {
            int x ,y;
            int hcf = 1,temp;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter  first number: ");
            x = in.nextInt();
            System.out.print("Enter second number: ");
            y = in.nextInt();

            if (x > y) {
                temp = x;
                x = y;
                y = temp;
            }

            for(int i = 1; i < (x+1); i++) {
                if (x%i == 0 && y%i == 0)
                    hcf = i;
            }

            System.out.println("HCF of "+ x +" and "+ y +" is: "+ hcf);
        }
    }

