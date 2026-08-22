import java.util.Scanner;
public class third {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. having 3 or more digits: ");
        int num = sc.nextInt();

        System.out.println("the third digit is: "+ (num%100)/10);
        sc.close();
    }
}