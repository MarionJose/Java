import java.util.Scanner;

public class Exampl{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter input ");
        int num= sc.nextInt();
        

        switch (num) {
            case 1:
             System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            default:
            System.out.printf("Your input number %d is not valid \n",num);
            
        }
            
            sc.close();
        
    }
        }
    


