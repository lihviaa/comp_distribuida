import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorServer implements Calculator{
    

    // *************************  DOUBLE  *************************
    //Método de soma
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }

    //Método de subtração
    public double sub(double a, double b) throws RemoteException {
        return a - b;
    }

    //Método de multiplicação
    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    //Método de divisão
    public double divide(double a, double b) throws RemoteException {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }


    // *************************  FRACTION  *************************
    //Método de soma
    public Fraction add(Fraction a, Fraction b) throws RemoteException {
        return a.add(b);
    }

    //Método de subtração
    public Fraction sub(Fraction a, Fraction b) throws RemoteException {
        return a.sub(b);
    }
    
    //Método de multiplicação
    public Fraction multiply(Fraction a, Fraction b) throws RemoteException {
        return a.multiply(b);
    }
    
    //Método de divisão
    public Fraction divide(Fraction a, Fraction b) throws RemoteException {
        return a.divide(b);
    }
    
    //Método de maior num
    public Fraction max(Fraction a, Fraction b) throws RemoteException {
        return a.max(b);        
    }

    //Método de menor num
    public Fraction min(Fraction a, Fraction b) throws RemoteException {
        return a.min(b);        
    }	


    // *************************  COMPLEX NUMBERS  *************************
    //Método de soma
    public ComplexNum add(ComplexNum a, ComplexNum b) throws RemoteException {
        return a.add(b);
    }

    //Método de subtração
    public ComplexNum sub(ComplexNum a, ComplexNum b) throws RemoteException {
        return a.sub(b);
    }
    
    //Método de multiplicação
    public ComplexNum multiply(ComplexNum a, ComplexNum b) throws RemoteException {
        return a.multiply(b);
    }
    
    //Método de divisão
    public ComplexNum divide(ComplexNum a, ComplexNum b) throws RemoteException {
        return a.divide(b);
    }

    //Método de maior num
    public ComplexNum max(ComplexNum a, ComplexNum b) throws RemoteException {
        return a.max(b);
    }
    
    //Método de menor num
    public ComplexNum min(ComplexNum a, ComplexNum b) throws RemoteException {
        return a.min(b);
    }

    public static void main(String[] args) {
        try {
            // Create and export the CalculatorServer object
            CalculatorServer server = new CalculatorServer();
            Calculator stub = (Calculator) UnicastRemoteObject.exportObject(server, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Calculator", stub);

            System.out.println("CalculatorServer is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
