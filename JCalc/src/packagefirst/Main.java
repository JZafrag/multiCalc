package packagefirst;
import static java.lang.System.in;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    	
    	boolean exit = true;
    	do {
    	System.out.println("Welcome to multics! Press 1 to use the standard calculator, press 0 to use the programmer calculator");
    	Scanner user = new Scanner(System.in);
    	int entry = user.nextInt();
    	if(entry >= 2) {
    		System.out.println("Error: must select two of the available numbers. Please try again1");
    	}
    	switch(entry) {
    	case 1:
    		System.out.println("Enter first and second number:");
    		Scanner inp= new Scanner(System.in);
    		int num1,num2;
    		num1 = inp.nextInt();
    		num2 = inp.nextInt();
    		int ans;
    		System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
    		int choose;
    		String userin = user.nextLine();
    		choose = inp.nextInt();
    		switch (choose){
    			case 1:
    				System.out.println("The answer is: "+add( num1,num2));
    				break;
    			case 2:
    				System.out.println("The answer is: "+sub( num1,num2));
    				break;      
    			case 3:
    				System.out.println("The answer is: "+mult( num1,num2));
    				break;
    			case 4:
    				System.out.println("The answer is: " + div( num1,num2));
    				break;
    			default:
    				System.out.println("Error: Illegal Operation");
    				exit = false;
    				break;
    			}break;
    		case 0:
    			try(Scanner in = new Scanner(System.in)) {
    				operations operation = new operations();
    				System.out.print("First Binary:  ");
    				String binOne = in.next();
    				System.out.print("Second Binary: ");
    				String binTwo = in.next();
    				System.out.println("Sum:        " + operation.GetBinarySum(binOne, binTwo));
    				System.out.println("Difference: " + operation.GetBinaryDiff(binOne, binTwo));
    				System.out.println("Product:    " + operation.GetBinaryProd(binOne, binTwo));
    				System.out.println("Quotient:   " + operation.GetBinaryQuotient(binOne, binTwo));
    			} catch(NumberFormatException e) {
    				System.out.println("Looks like you entered a non Binary digit.");
    			} finally {
    				in.close();
    			}
    			exit = false;
    			break;
    		default:
    			System.out.println("Error: not an option");
    		}
    	}while(exit == true);


    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}