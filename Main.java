//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        Cylinder c1 = new Cylinder();
//        System.out.println("Cylinder:"
//                + " radius=" + c1.getRadius()
//                + " height=" + c1.getHeight()
//                + " base area=" + c1.getArea()
//                + " volume=" + c1.getVolume());
//
//        // Declare and allocate a new instance of cylinder
//        //   specifying height, with default color and radius
//        Cylinder c2 = new Cylinder(10.0);
//        System.out.println("Cylinder:"
//                + " radius=" + c2.getRadius()
//                + " height=" + c2.getHeight()
//                + " base area=" + c2.getArea()
//                + " volume=" + c2.getVolume());
//
//        // Declare and allocate a new instance of cylinder
//        //   specifying radius and height, with default color
//        Cylinder c3 = new Cylinder(2.0, 10.0);
//        System.out.println("Cylinder:"
//                + " radius=" + c3.getRadius()
//                + " height=" + c3.getHeight()
//                + " base area=" + c3.getArea()
//                + " volume=" + c3.getVolume());

                Animal myDog = new Dog("Buddy", 3);
                Animal myCat = new Cat("Whiskers", 2);

                // Display info
                myDog.displayInfo();
                myCat.displayInfo();

                // Call methods specific to subclasses
                myDog.makeSound();
                myCat.makeSound();

                // Cast to specific subclass to call subclass-specific methods
                if (myDog instanceof Dog) {
                    ((Dog) myDog).fetch();
                }

                if (myCat instanceof Cat) {
                    ((Cat) myCat).scratch();
                }
            }
}