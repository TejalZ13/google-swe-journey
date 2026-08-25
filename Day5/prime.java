import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.");
        int num = sc.nextInt();
        boolean prime = true;

        if(num <=1){
            prime = false;
        }

        for (int i=2; i*i<=num; i++){
            if( num%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(num+" is prime.");
        }
        else{
            System.out.println(num+" is not prime.");
        }
        sc.close();
    }
}