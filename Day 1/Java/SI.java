import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal");
        double p=sc.nextDouble();
        System.out.println("Enter the Rate");
        double r=sc.nextDouble();
         System.out.println("Enter the time");
        double t=sc.nextDouble();

        System.out.println("Simple Interest ="+ ((p*r*t)/100));
        sc.close();
    }
}