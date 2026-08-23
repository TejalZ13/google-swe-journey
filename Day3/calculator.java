import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos. :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the operation you want:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");   
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b!=0){
                    System.out.println(a/b);
                }
                else{
                    System.out.println("Div by zero not possible.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
        }

    }

