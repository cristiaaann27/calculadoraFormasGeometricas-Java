import java.lang.Math;

public class TrianguloEquilatero extends Forma {
    private double lado;

    public TrianguloEquilatero(double lado) {
        super();
        this.lado = lado;
        this.area = (Math.sqrt(3) / 4) * (this.lado * this.lado);
        this.perimetro = this.lado * 3;
        this.apotema = (this.lado * Math.sqrt(3)) / 6;
        this.angulosInternos = new double[] { 60, 60, 60 };
        this.angulosExternos = new double[] { 120, 120, 120 };
    }

    public double getLado() {
        return lado;
    }
}

