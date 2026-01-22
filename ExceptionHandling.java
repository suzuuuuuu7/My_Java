public class ExceptionHandling {
public static void main(String[] args) {
    try{  // Block where exception may occurs
        int a= 30;
        int b = 0;
        int div = a/b;
        System.out.println("Result is:"+div); // print output
    }
    catch(ArithmeticException e){ // catch the exception of occurs
        System.out.println("Exception caught"+e.getMessage());
    }
    
finally{
    System.out.println("Finally block always executedd..");  // final blocks always exectuted.
 
        int sum = 20+39;
        System.out.println("Sum: "+sum);
    
}
    
    }
}
    

