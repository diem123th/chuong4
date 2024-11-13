public class Dog extends Animal{
    public  Dog(String name,int age){
        super(name, age);
    }
    public  void  makeSound(){
        System.out.println("Dog barks");
    }
    public  void fetch(){
        System.out.println("Dog is fetching the ball");
    }
}
