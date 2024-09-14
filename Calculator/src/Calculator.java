import java.rmi.Remote;
//import java.rmi.RemoteException;
import java.rmi.RemoteException;

public interface Calculator extends Remote{

    // *************************  DOUBLE  *************************
    public double add(double a, double b) throws RemoteException;
    public double sub(double a, double b) throws RemoteException;
    public double multiply(double a, double b) throws RemoteException;
    public double divide(double a, double b) throws RemoteException;


    // *************************  FRACTION  *************************
    public Fraction add(Fraction a, Fraction b) throws RemoteException;
    public Fraction sub(Fraction a, Fraction b) throws RemoteException;
    public Fraction multiply(Fraction a, Fraction b) throws RemoteException;
    public Fraction divide(Fraction a, Fraction b) throws RemoteException;
    public Fraction max(Fraction a, Fraction b) throws RemoteException;
    public Fraction min(Fraction a, Fraction b) throws RemoteException;


    // ***********************  COMPLEX NUMBERS  **********************
    public ComplexNum add(ComplexNum a, ComplexNum b) throws RemoteException;
    public ComplexNum sub(ComplexNum a, ComplexNum b) throws RemoteException;
    public ComplexNum multiply(ComplexNum a, ComplexNum b) throws RemoteException;
    public ComplexNum divide(ComplexNum a, ComplexNum b) throws RemoteException;
    public ComplexNum max(ComplexNum a, ComplexNum b) throws RemoteException;
    public ComplexNum min(ComplexNum a, ComplexNum b) throws RemoteException;

}