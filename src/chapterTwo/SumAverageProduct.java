package chapterTwo;//To compare integers
import java.util.Scanner;
public class SumAverageProduct{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer: ");
	int num1 = input.nextInt();

	
	System.out.println("Enter second integer: ");
	int num2 = input.nextInt();
	

	System.out.println("Enter third integer: ");
	int num3 = input.nextInt();

	int sum = num1 + num2 + num3;
	int avg = (num1 + num2 + num3)/3;
	int product = num1 * num2 * num3;
	
	System.out.println("The sum of the three numbers is "+sum);
	System.out.println("The average of the three numbers is "+avg);
	System.out.println("The Product of the three numbers is "+product); 
	

	if ((num1 > num2) && (num2 > num3)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",num1,num3);}
	
	if ((num1 > num3) && (num3 > num2)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",num1,num2);}
	
	if ((num2 > num1) && (num1 > num3)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",num2,num3);}

	if ((num2 > num3) && (num3 > num1)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",num2,num1);}

	if ((num3 > num1) && (num1 > num2)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",num3,num2);}

	if ((num3 > num2) && (num2 > num1)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",num3,num1);}

}
}

	
	