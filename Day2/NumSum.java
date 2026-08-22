import java.util.Scanner;
public class NumSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three digit number: ");
        int num = sc.nextInt();

        int num1 = num/100;
        int num2 = (num/10)%10;
        int num3 = num%10;

        System.out.println("The sum of the digits is: " + (num1 + num2 + num3));
        sc.close();
    }
}