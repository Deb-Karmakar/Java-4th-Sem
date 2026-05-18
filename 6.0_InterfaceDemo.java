// 1. Create three interfaces, each with two methods.

interface FirstInterface {
    void methodOneA();
    void methodOneB();
}

interface SecondInterface {
    void methodTwoA();
    void methodTwoB();
}

interface ThirdInterface {
    void methodThreeA();
    void methodThreeB();
}

// 2. Inherit a new interface from these three interfaces, adding a new method.
interface CombinedInterface extends FirstInterface, SecondInterface, ThirdInterface {
    void newMethod();
}

// 3. Create a concrete class to inherit from.
class BaseClass {
    public void baseClassMethod() {
        System.out.println("Method from the concrete BaseClass.");
    }
}

// 4. Create a class by implementing the new interface and inheriting from a concrete class.
class MyClass extends BaseClass implements CombinedInterface {

    // Implementing methods from FirstInterface
    @Override
    public void methodOneA() { System.out.println("Executing methodOneA"); }
    @Override
    public void methodOneB() { System.out.println("Executing methodOneB"); }

    // Implementing methods from SecondInterface
    @Override
    public void methodTwoA() { System.out.println("Executing methodTwoA"); }
    @Override
    public void methodTwoB() { System.out.println("Executing methodTwoB"); }

    // Implementing methods from ThirdInterface
    @Override
    public void methodThreeA() { System.out.println("Executing methodThreeA"); }
    @Override
    public void methodThreeB() { System.out.println("Executing methodThreeB"); }

    // Implementing the method from CombinedInterface
    @Override
    public void newMethod() { System.out.println("Executing newMethod from CombinedInterface"); }
}

public class InterfaceDemo {

    // 5. Write four methods, each of which takes one of the four interfaces as an argument.
    static void takesFirst(FirstInterface f) {
        System.out.println("\n--- Inside takesFirst method ---");
        f.methodOneA();
    }

    static void takesSecond(SecondInterface s) {
        System.out.println("\n--- Inside takesSecond method ---");
        s.methodTwoA();
    }

    static void takesThird(ThirdInterface t) {
        System.out.println("\n--- Inside takesThird method ---");
        t.methodThreeA();
    }

    static void takesCombined(CombinedInterface c) {
        System.out.println("\n--- Inside takesCombined method ---");
        c.newMethod();
    }

    public static void main(String[] args) {
        // 6. In main(), create an object of your class and pass it to each of the methods.
        MyClass obj = new MyClass();
        
        // The single object 'obj' can be treated as any of the interfaces it implements
        takesFirst(obj);
        takesSecond(obj);
        takesThird(obj);
        takesCombined(obj);
        
        // We can also call the base class method
        System.out.println("\n--- Calling base class method ---");
        obj.baseClassMethod();
    }
}