import java.util.Scanner;
public class Takeinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age..");
        int a = sc.nextInt();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Enter salary.");
        long Salary = sc.nextLong();
        System.out.println("Enter your weight");
        float wt = sc.nextFloat();
        System.out.println("Enter your exact value");
        double value = sc.nextDouble();
        System.out.println("This is your Information:");
        System.out.println("Name: "+name+"\t"+"Age: "+a+"\t"+"Address "+address+"\t"+"Salary "+Salary+"\t"+"Weight  "+"\t"+wt+"Value"+value);
    }  
}
