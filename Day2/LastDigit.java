import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The last digit is: " + (num % 10));
        sc.close(); 
    }
}
