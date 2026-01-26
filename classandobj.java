
 class Animal{
        void eats(){
            System.out.println("Animals eats foods.");
        }
    }
    class dog extends Animal{
        void  bark(){
            System.out.println("Dog barks");
        }
    }
    public class classandobj {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.eats();
        d1.bark();
        

    }
} 

