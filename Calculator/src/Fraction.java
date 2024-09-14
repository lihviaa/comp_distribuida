public class Fraction implements java.io.Serializable{
    int numerator, denominator;
    private static final long serialVersionUID = 1L;

     // Construtores
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {}

    // Método para adicionar soma de frações
    public Fraction add(Fraction otherf) {
        Fraction result = new Fraction();
        result.numerator = (this.numerator * otherf.denominator) + (this.denominator * otherf.numerator);
        result.denominator = this.denominator * otherf.denominator;

        return result;
    }

    // Método para subtrair duas frações
    public Fraction sub(Fraction otherf) {
        Fraction result = new Fraction();
        result.numerator = (this.numerator * otherf.denominator) - (this.denominator * otherf.numerator);
        result.denominator = this.denominator * otherf.denominator;

        return result;
    }

    // Método para multiplicar duas frações
    public Fraction multiply(Fraction otherf) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * otherf.numerator;
        result.denominator = this.denominator * otherf.denominator;

        return result;
    }

    // Método para dividir frações
    public Fraction divide(Fraction otherf){
        Fraction result = new Fraction();
        result.numerator = this.numerator * otherf.denominator;
        result.denominator = this.denominator * otherf.numerator;
        
        return result;
    }

    // Método para achar a maior fração
    public Fraction max(Fraction otherf){
        return (this.numerator/this.denominator >= otherf.numerator/otherf.denominator) ? this : otherf;
    }

    // Método para achar a menor fração
    public Fraction min(Fraction otherf){
        return (this.numerator/this.denominator < otherf.numerator/otherf.denominator) ? this : otherf;
    }

    // Método toString para representar a fração em forma de string
    public String print() { return numerator + "/" + denominator; }

}
