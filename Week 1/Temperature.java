import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in celsius: ");
        double A=input.nextInt();

        double B= (A*(9.0/5.0)+32.0);
        
        System.out.println("temperature in fahrenheit :"+B);
        input.close();
    }
}