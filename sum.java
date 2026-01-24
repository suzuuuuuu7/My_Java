import java.util.Scanner;
public class sum {
    public static void main(String[] args){  
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int x = sc.nextInt();
    System.out.println("Enter second number");
    float y = sc.nextFloat();
    float sum = x+y;
    System.out.println("The sum of two number is: "+sum);
}
}