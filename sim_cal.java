import java.util.Scanner;

public class sim_cal {
    public static void main (String args []){

        int operator,num1,num2;
        System.out.println("/n 1 - Addition /n 2 - Subtraction /n 3 - Multiplication /n 4 - Division /n 5 - Modulus ");
        System.out.println("Choose the operator : ");

        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();

        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        int Answer = 0;
        switch(operator){

            case 1 :
                Answer = num1+num2;
                break;
            case 2 :
                Answer = num1-num2;
                break;
            case 3 :
                Answer = num1*num2;
                break;
            case 4 :
                if (num2==0) {
                    System.out.println("Cannot divided by zero ");
                }
                else {
                    Answer = num1 / num2;
                }
                break;
            case 5 :
                if (num2==0) {
                    System.out.println("Cannot divided by zero ");
                }
                else {
                    Answer = num1 % num2;
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Answer is :"+Answer);

    }
}
