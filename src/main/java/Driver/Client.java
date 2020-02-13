package Driver;

import java.util.Scanner;
import com.cisi.CompoundInterest.CI;
import com.cisi.SimpleInterest.SI;

/**
 * Hello world!
 *
 */
public class Client 
{
	double principleAmount;
	double rateOfInterest;
	double timePeriod;
	double compoundInterest;
	double simpleInterest;
	
    public static void main( String[] args )
    {
    	CI ci = new CI();
    	SI si = new SI();
    	Client client = new Client();
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the principle amount : ");
    	client.principleAmount = scanner.nextDouble();
    	
    	System.out.println("Enter the rate of interest : ");
    	client.rateOfInterest = scanner.nextDouble();
    	
    	System.out.println("Enter the time period : ");
    	client.timePeriod = scanner.nextDouble();    	
    	
    	client.compoundInterest = ci.calcCI(client.principleAmount,client.rateOfInterest,client.timePeriod);
    	System.out.println("The compound interest is : "+client.compoundInterest);
    	
    	client.simpleInterest = si.calcSI(client.principleAmount,client.rateOfInterest,client.timePeriod);
    	System.out.println("The simple interest is : "+client.simpleInterest);
    }
}