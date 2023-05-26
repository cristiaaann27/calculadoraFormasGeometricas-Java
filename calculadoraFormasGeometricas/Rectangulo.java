public class Rectangulo extends Forma {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = this.lado1 * this.lado2;
        this.perimetro = 2 * (this.lado1 + this.lado2);
        this.angulosInternos = new double[] { 90, 90, 90, 90 };
        this.angulosExternos = new double[] { 90, 90, 90, 90 };
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    
}
