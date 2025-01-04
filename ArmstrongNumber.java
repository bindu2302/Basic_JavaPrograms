import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Input the number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int power = countDigits(num);
        
        int sum = checkArmstrong(num, power);
        
        if(num == sum) {
        	System.out.println(num+" is armstrong number"); 	
        } else {
        	System.out.println(num+" is not armstrong number");
        }
        
    }
    
    public static int countDigits(int num) {
    	int digitCount =0;
    	while(num>0) {
    		num = num/10;
    		digitCount++;	
    	}
    	return digitCount;
    }
    
    public static int checkArmstrong(int num, int power)
    {
    	int sum =0;
    	while(num>0)
    	{
    		int digit = num %10;
    		int powerValue = findPower(digit,power);
    		sum = sum + powerValue;
    		num= num/10;			
    	}
    	return sum;
    }
    
    public static int findPower(int num, int power)
    {
    	int numPower = 1;
    	// multiplying num itself power times
    	for(int i=1;i<=power;i++)
    	{
    		numPower = numPower*num;
    	}
    	return numPower;
    } 
}














        