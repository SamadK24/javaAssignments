// File: IceCreamShop.java

// --- Abstract Products ---
interface Cone {
    void serve();
}

interface Cup {
    void serve();
}

// --- Concrete Products: Vanilla ---
class VanillaCone implements Cone {
    public void serve() {
        System.out.println("Serving Vanilla in a cone.");
    }
}

class VanillaCup implements Cup {
    public void serve() {
        System.out.println("Serving Vanilla in a cup.");
    }
}

// --- Concrete Products: Chocolate ---
class ChocolateCone implements Cone {
    public void serve() {
        System.out.println("Serving Chocolate in a cone.");
    }
}

class ChocolateCup implements Cup {
    public void serve() {
        System.out.println("Serving Chocolate in a cup.");
    }
}

// --- Abstract Factory ---
interface IceCreamFactory {
    Cone createCone();
    Cup createCup();
}

// --- Concrete Factories ---
class VanillaFactory implements IceCreamFactory {
    public Cone createCone() {
        return new VanillaCone();
    }

    public Cup createCup() {
        return new VanillaCup();
    }
}

class ChocolateFactory implements IceCreamFactory {
    public Cone createCone() {
        return new ChocolateCone();
    }

    public Cup createCup() {
        return new ChocolateCup();
    }
}

// --- Client Code ---
public class IceCreamShop {
    public static void main(String[] args) {
        // Choose flavor dynamically
        String flavor = "Vanilla"; // Change to "Chocolate" to test

        IceCreamFactory factory;

        if (flavor.equalsIgnoreCase("Vanilla")) {
            factory = new VanillaFactory();
        } else {
            factory = new ChocolateFactory();
        }

        // Client doesn't know which exact cone/cup it's getting
        Cone cone = factory.createCone();
        Cup cup = factory.createCup();

        // Serve the ice cream
        cone.serve();
        cup.serve();
    }
}
