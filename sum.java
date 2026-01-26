import java.util.Scanner;
public class sum {
    public static void main(String[] args){  
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int x = sc.nextInt();
    System.out.println("Enter second number");
    float y = sc.nextFloat();
    System.out.println("Enter third number..");
    long z = sc.nextLong();
    float sum = x+y+z;
      System.out.println("The sum of three number is: "+sum);
      float avg = sum/3;
      System.out.println("The average number is: "+avg);
}
}