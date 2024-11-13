public class Cat extends  Animal {
    public  Cat(String name,int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Cat meows");
    }
    public  void  scratch(){
        System.out.println("Cat is scratching");
    }
}
