//Enter a number: 153     
//153 is armstrong number  

//Enter a number: 164
//164 is not armstrong number

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Input the number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
//        int n = scanner.nextInt();
//        
//        int temp = n, sum = 0;
//        
//        while(n>0) {
//        	int digit = n % 10;
//        	sum = sum + digit * digit * digit;
//        	n /= 10;
//        }
//        
//        if(sum==n) {
//        	System.out.println(n + " is an Armstrong number");
//        } else {
//        	System.out.println(n + " is not Armstrong number");
//        }
        
        
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
    
    
//    public boolean isArmstrong(int n) {
//    	int digits=0, sum=0, temp =n;
//    	int copy = n;
//    	
//    	while(copy > 0) {
//    		digits++;
//    		copy /= 10;
//    	}
//    	
//    	while(temp > 0) {
//    		int power = 1;
//    		int r = temp % 10;
//    		for(int i=0; i<digits; i++) {
//    			power *= r;
//    		}
//    		sum += power;
//    		temp /= 10;
//    	}
//    	return sum == n;
//    }
    
}















        