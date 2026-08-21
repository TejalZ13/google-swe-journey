import java.util.Scanner;
public class marks_percent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float m4=sc.nextFloat();
        float m5=sc.nextFloat();

        float total= m1+m2+m3+m4+m5;

        System.out.println("Total Percentage:"+ (total/500)*100);
        sc.close();
    }
}