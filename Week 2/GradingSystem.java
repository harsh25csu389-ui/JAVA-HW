import java.util.Scanner;
public class GradingSystem
{
    
    public void PrintGrade()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int A=input.nextInt();
        
        if(A>=80&&A<=100)
        {
            System.out.println("Distinction");
        }
        else if(A>=70&&A<=79)
        {
            System.out.println("Merit");
        }
        else if(A>=50&&A<=69)
        {
            System.out.println("Pass");
        }
        else if(A>=0&&A<=49)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("invalid marks");
        }
        System.out.println("\n");
        input.close();
    }
}