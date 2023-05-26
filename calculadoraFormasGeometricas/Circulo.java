import java.lang.Math;

public class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        super();
        this.radio = radio;
        this.area = Math.PI * (this.radio * this.radio);
        this.perimetro = 2 * Math.PI * this.radio;
        this.apotema = this.radio;
        this.angulosInternos = new double[] { 0 };
        this.angulosExternos = new double[] { 0 };
    }

    public double getRadio() {
        return radio;
    }
}
