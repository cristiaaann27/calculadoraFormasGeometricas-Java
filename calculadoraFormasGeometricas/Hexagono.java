import java.lang.Math;

public class Hexagono extends Forma {
    private double lado;

    public Hexagono(double lado) {
        super();
        this.lado = lado;
        this.area = (3 * Math.sqrt(3) * this.lado * this.lado) / 2;
        this.perimetro = this.lado * 6;
        this.apotema = (this.lado * Math.sqrt(3)) / 2;
        this.angulosInternos = new double[] { 120, 120, 120, 120, 120, 120 };
        this.angulosExternos = new double[] { 60, 60, 60, 60, 60, 60 };
    }

    public double getLado() {
        return lado;
    }
}
