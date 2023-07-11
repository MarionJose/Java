import java.util.Scanner;

public class Studenthw{
    public static void main(String[] args){

    

    Scanner sc=new Scanner(System.in);


    System.out.println("Enter Roll number");
    int rolln= sc.nextInt();



switch (rolln) {
            case 1:
             System.out.printf("Krishna,reg no is  %d",rolln);
            break;

            case 2:
           System.out.printf("Marion,reg no is  %d",rolln);
            break;

            case 3:
            System.out.printf("Sree,reg no is  %d",rolln);
            break;

            case 4:
            System.out.printf("Sobin,reg no is  %d",rolln);
            break;

            case 5:
            System.out.printf("Preetha,reg no is  %d",rolln);
            break;

    default:
            System.out.printf("Your roll no %d is not valid \n",rolln);

}
  sc.close();
    }
}