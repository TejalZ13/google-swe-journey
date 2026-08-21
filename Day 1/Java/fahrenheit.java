import java.util.Scanner;
public class fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("the conversion of" +celsius+"C to fahrenheit is:"+fahrenheit);
        sc.close();
    }
    
}
