public class ComplexNum implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private double real, imaginary;

    // Construtor
    public ComplexNum(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // Método toString para representar o número complexo em forma de string
    public String toString() {
        if(imaginary == 0) return real + "";
        if(real == 0) return imaginary + "i";
        if(imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    // Método para adicionar soma de números complexos
    public ComplexNum add(ComplexNum other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new ComplexNum(resultReal, resultImaginary);
    }

    // Método para subtrair números complexos
    public ComplexNum sub(ComplexNum other) {
        double resultReal = this.real - other.real;
        double resultImaginary = this.imaginary - other.imaginary;
        return new ComplexNum(resultReal, resultImaginary);
    }

    // Método para multiplicar números complexos
    public ComplexNum multiply(ComplexNum other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNum(resultReal, resultImaginary);
    }

    // Método para dividir números complexos
    public ComplexNum divide(ComplexNum other) {
        double scale = other.real * other.real + other.imaginary * other.imaginary;

        return this.multiply(new ComplexNum(other.real / scale, -other.imaginary / scale));
    }

    // Método para calcular o módulo (ou magnitude) do número complexo
    public double modulus() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    // Método para encontrar o número complexo com o maior módulo
    public ComplexNum max(ComplexNum other) {
        return this.modulus() >= other.modulus() ? this : other;
    }

    // Método para encontrar o número complexo com o menor módulo
    public ComplexNum min(ComplexNum other) {
        return this.modulus() <= other.modulus() ? this : other;
    }
}

