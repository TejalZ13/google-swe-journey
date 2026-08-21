import java.util.Scanner;

public class perimeter_rec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        float l= sc.nextFloat();
        System.out.println("Enter breadth:");
        float b= sc.nextFloat();
        System.out.println("Perimeter=" + (2*(l+b)));
        sc.close();

    }
    
}
