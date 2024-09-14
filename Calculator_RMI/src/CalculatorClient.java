import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Lookup the Calculator object
            Calculator stub = (Calculator) registry.lookup("Calculator");

            // Invoke remote methods
            double a = 10.0;
            double b = 5.0;
	        Fraction f1 = new Fraction(1,2);
            Fraction f2 = new Fraction(2,3);

            // *************************  DOUBLE  *************************
            System.out.println("\n> Double Operations");
            System.out.println("> Double A: " + a);
            System.out.println("> Double B: " + b);
            System.out.println("Addition: " + stub.add(a, b));
            System.out.println("Subtraction: " + stub.sub(a, b));
            System.out.println("Multiplication: " + stub.multiply(a, b));
            System.out.println("Division: " + stub.divide(a, b));

            
            // *************************  FRACTION  *************************
            System.out.println("\n> Fraction Operations");
            System.out.println("> Fraction A: " + f1.print());
            System.out.println("> Fraction B: " + f2.print());
            System.out.println("Addition: " + stub.add(f1, f2).print());
            System.out.println("Subtraction: " + stub.sub(f1, f2).print());
            System.out.println("Multiplication: " + stub.multiply(f1, f2).print());
            System.out.println("Division: " + stub.divide(f1, f2).print());
            System.out.println("Max: " + stub.max(f1, f2).print());
            System.out.println("Min: " + stub.min(f1, f2).print());

            System.out.println("\n> Complex Numbers Operations");
            ComplexNum c1 = new ComplexNum(5, 6);
            System.out.println("> Complex Number A: " + c1.toString());
            ComplexNum c2 = new ComplexNum(-3, 4);
            System.out.println("> Complex Number B: " + c2.toString());

            System.out.println("Addition: " + stub.add(c1, c2).toString());
            System.out.println("Subtraction: " + stub.sub(c1, c2).toString());
            System.out.println("Multiplication: " + stub.multiply(c1, c2).toString());
            System.out.println("Division: " + stub.divide(c1, c2).toString());
            System.out.println("Max: " + stub.max(c1, c2).toString());
            System.out.println("Min: " + stub.min(c1, c2).toString());

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
