import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num");
        int num= sc.nextInt();
        int original = num;
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum= sum+digit* digit * digit;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Is armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}
