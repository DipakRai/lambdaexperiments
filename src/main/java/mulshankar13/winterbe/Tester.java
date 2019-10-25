package mulshankar13.winterbe;

public class Tester {
    public static void main(String[] args) {
    HelloWorld helloWorld = () -> { 
          //you define the behavior for the abstract 
          //through lambda
      System.out.println("Hello Lambda");                                    
        };
    helloWorld.sayHello();
    helloWorld = () -> { 
          // you define a different behavior 
          // (addition this time) for the same 
          // abstraction
      System.out.println(4+5);
    };
      helloWorld.sayHello();
    } 
}
@FunctionalInterface
interface HelloWorld {
    public abstract void sayHello(); 
        //you define one abstract method. 
        //Just the method not its behavior
}
