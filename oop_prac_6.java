import java.util.Scanner;

public class oop_prac_6 {
    public static void main(String[] args) {
        int i, num1, num2;

        int array[] = {5,25,30,40,50,86};
        try
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter 1st number: ");
            num1 = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            num2 = sc.nextInt();
            System.out.print("Enter array index you want to access: ");
            i = sc.nextInt();
            System.out.println("<------------------------------------------------------>");
            
            System.out.println("Division of two integers: " + (num1/num2));
            System.out.println("Array Element array[" +i+ "] is: " + array[i]);
            System.out.println("<------------------------------------------------------>");
            System.out.println();
            sc.close();
        }

        catch (ArithmeticException e)
        {   
            System.out.println(e);
            System.out.println("Divided by zero!!!\nCheck your 2nd no i.e Denominator");
            System.out.println("<------------------------------------------------------>");
        }

        catch (ArrayIndexOutOfBoundsException e1)
        {   
            System.out.println(e1);
            System.out.println("Check the array index you are trying to access!!!\nMax Index is 5.");
            System.out.println("<------------------------------------------------------>");
        }

        catch (Exception n)
        {
            System.out.println(n);
            System.out.println("Use only integers!!!\nPlease try again.");
            System.out.println("<------------------------------------------------------>");
        }

        //System.out.println("<------------------------------------------------------>");
        System.out.println("End of Exception Handling!!!");
        //System.out.println("<------------------------------------------------------>");
    }
}