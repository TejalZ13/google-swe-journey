import java.util.Scanner;
public class G_of_two {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a>b){
            System.out.println("The greater number is: "+a);
        }
        else{
            System.out.println("The greater number is: "+b);
        }
        sc.close();
    }
    
}
