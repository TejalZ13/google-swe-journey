import java.util.Scanner;

public class area_circle {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double r= sc.nextDouble();
        

        System.out.println("Area of circle is:"+ (3.14*r*r));
        sc.close();
    }
    
}
