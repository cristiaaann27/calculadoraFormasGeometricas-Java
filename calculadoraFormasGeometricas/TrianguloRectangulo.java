import java.lang.Math;

public class TrianguloRectangulo extends Rectangulo {
    public TrianguloRectangulo(double base, double altura) {
        super(base, altura);
        this.area = super.getArea() / 2;
        double hipotenusa = Math.sqrt((this.getLado1() * this.getLado1()) + (this.getLado2() * this.getLado2()));
        this.perimetro = this.getLado1() + this.getLado2() + hipotenusa;
        this.angulosInternos = new double[] { 90, Math.toDegrees(Math.atan(this.getLado2() / this.getLado1())),
                Math.toDegrees(Math.atan(this.getLado1() / this.getLado2())) };
        this.angulosExternos = new double[] { 90,
                (180 - (Math.toDegrees(Math.atan(this.getLado2() / this.getLado1())))),
                (180 - (Math.toDegrees(Math.atan(this.getLado1() / this.getLado2())))) };
    }
}
