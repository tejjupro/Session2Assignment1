package package1;    //This java file is inside package named package1 inside src folder.
import java.util.*;  //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

public class Assignment2_1              //class declaration.
{
	public static void main(String[] args)     // main function declaration. and because it is static, program execution starts from main function.
	{
		int a,b,c;   //declaring three variables which we want to compare.
		int max;     //declaration of max variable in which we will store the maximum value.
		
		
		System.out.println("Enter the three numbers seperated by space which you want to compare");
		// asking values of a,b and c from the user.
		// for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		
		//Now we want to take input of the values of a,b and c from the user.
		// For taking input from the user, we have to make the object of Scanner class.
		//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		
		Scanner sc=new Scanner(System.in);   //creating object of Scanner class.
		
		a=sc.nextInt();     //initializing a variable by the first value entered by the user. 
		b=sc.nextInt();     //initializing b variable by the second value entered by the user.
		c=sc.nextInt();     //initializing c variable by the third value entered by the user.
		
		
		
		//Relational operators used in this assignment are...
		// 1. >   -- Greater than operator.  Ex.(a > b) [a is greater than b].
		// 2. <   -- Less than operator.  Ex.(a < b) [a is less than b].
		// 3. >=   -- Greater than or equal to operator.  Ex.(a >= b) [a is greater than or equal to b].
		// 4. <=   -- Less than or equal to operator.  Ex.(a <= b) [a is Less than or equal to b].
		
			
		
		//We will first compare a with b ignoring c for sometime.
		if(a>=b)        //if a is greater than or equal to b then this part of conditional statement will work.
		{
			//Now if a is greater than or equal to b then we just need to compare a and c. because if c is greater than a then it will also be greater than b.
			
			if(a>=c)        // comparing a and c
				max=a;     //if a is greater than or equal to c and from outer conditional statement it is also >= b. Then max is initialized to value of a.
			
			else            //if a < c
				max=c;     // a >= b but if c > a.. Then c > a and c > b. So, c will be maximum. so, max is initialized by value of c. 
		}
		
		else           // if a < b
		{
			//Now if b is greater than a then we just need to compare b and c. because if c is greater than b then it will also be greater than a.
			
			if(b>=c)        // comparing b and c
				max=b;     //if b is greater than or equal to c and from outer conditional statement it is also > a. Then max is initialized to value of b.
			
			else            //if b < c
				max=c;     // a < b but if c > b.. Then c > b and c > a. So, c will be maximum. so, max is initialized by value of c. 
		}
		
		//So, by above conditional statements, we have initialized the value of max variable which has the maximum value among a,b and c.
		
		//Printing the max variable on console.
		System.out.println("Highest number among the three numbers which you have entered is "+max);
		
		sc.close();           //closing Scanner object sc. 
	}
}